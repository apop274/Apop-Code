import cv2
from PIL import ImageGrab
import numpy as np
from PIL.Image import NONE
import pyautogui

top_leftx = 720
top_lefty = 120
bottom_rightx = 1100
bottom_righty = 450

def detect_open_area(image):
    # Convert the image to grayscale
    gray = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)

    # Apply thresholding to obtain a binary image
    _, threshold = cv2.threshold(gray, 200, 255, cv2.THRESH_BINARY_INV)

    # Find contours in the binary image
    contours, _ = cv2.findContours(threshold, cv2.RETR_EXTERNAL, cv2.CHAIN_APPROX_SIMPLE)

    # Sort the contours by area in descending order
    contours = sorted(contours, key=cv2.contourArea, reverse=True)

    # Find the largest contour (open area)
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
    # Capture the game screen within the specified bounding box
    img = grabScreen(bbox=(top_leftx, top_lefty, bottom_rightx, bottom_righty))

    # Detect the open area on the log
    bounding_box = detect_open_area(img)

    if bounding_box is not None:
        x, y, w, h = bounding_box

        #margin for the smaller bounding box
        margin = 10

        #smaller bounding box coordinates
        x_small = x + margin
        y_small = y + margin
        w_small = w - 2 * margin
        h_small = h - 2 * margin

        #smaller bounding box around the open area
        cv2.rectangle(img, (x_small, y_small), (x_small + w_small, y_small + h_small), (0, 255, 0), 2)

        # Display the screen with the bounding box
        cv2.imshow('Screen', img)

        #center of the smaller bounding box
        center_x = x_small + w_small // 2
        center_y = y_small + h_small // 2

        pyautogui.click(top_leftx + center_x, top_lefty + center_y)

    else:
        #no open area detected within the bounding box
        cv2.imshow('Screen', img)

    if cv2.waitKey(1) == ord('q'):
        break

cv2.destroyAllWindows()
