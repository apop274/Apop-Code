import cv2
from PIL import ImageGrab
import numpy as np
from PIL.Image import NONE
import pyautogui

top_leftx = 790
top_lefty = 200
bottom_rightx = 1140
bottom_righty = 560


def detect_open_area(image):
    #grayscale
    gray = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)

    #threshold
    _, threshold = cv2.threshold(gray, 200, 255, cv2.THRESH_BINARY_INV)

    #find countours (binary image)
    contours, _ = cv2.findContours(threshold, cv2.RETR_EXTERNAL, cv2.CHAIN_APPROX_SIMPLE)

    #contours soureted by area in descending order
    contours = sorted(contours, key=cv2.contourArea, reverse=True)

    #largest contour
    if len(contours) > 0:
        largest_contour = contours[0]
        x, y, w, h = cv2.boundingRect(largest_contour)
        return x, y, w, h

    return None

def grabScreen(bbox=None):
    img = ImageGrab.grab(bbox=bbox)
    img = np.array(img)
    img = cv2.cvtColor(img, cv2.COLOR_RGB2BGR)
    return img

while True:
    #bbox
    img = grabScreen(bbox=(top_leftx, top_lefty, bottom_rightx, bottom_righty))

    #detect open spot on log
    bounding_box = detect_open_area(img)


    #if bbox has a large countour
    if bounding_box is not None:
        x, y, w, h = bounding_box

        #margin size
        margin = 10

        #coordinates for the green rectangle
        x_small = x + margin
        y_small = y + margin
        w_small = w - 2 * margin
        h_small = h - 2 * margin

        #green rectangle around largest countour
        cv2.rectangle(img, (x_small, y_small), (x_small + w_small, y_small + h_small), (0, 255, 0), 2)

        cv2.imshow('Screen', img)

        #center of green box
        center_x = x_small + w_small // 2
        center_y = y_small + h_small // 2
        
        pyautogui.click(top_leftx + center_x, top_lefty + center_y)

    else:
        #no open area detected within the bounding box
        cv2.imshow('Screen', img)

    if cv2.waitKey(1) == ord('q'):
        break

cv2.destroyAllWindows()
