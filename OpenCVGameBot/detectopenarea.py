import cv2
import numpy as np
import pyautogui

# Function to detect the open area on the log and return its bounding box
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
