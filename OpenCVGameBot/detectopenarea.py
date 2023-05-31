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

# Main loop
while True:
    # Capture a screenshot of the game screen
    screenshot = pyautogui.screenshot()

    # Convert the screenshot to a numpy array
    screenshot_np = np.array(screenshot)

    # Convert the color channels from BGR to RGB
    screenshot_rgb = cv2.cvtColor(screenshot_np, cv2.COLOR_BGR2RGB)

    # Detect the open area on the log and get its bounding box
    bounding_box = detect_open_area(screenshot_rgb)

    if bounding_box is not None:
        x, y, w, h = bounding_box

        # Draw a bounding box around the open area
        cv2.rectangle(screenshot_np, (x, y), (x + w, y + h), (0, 255, 0), 2)

        # Display the screenshot with the bounding box
        cv2.imshow('Game Screen', screenshot_np)
        cv2.waitKey(1)

        # Simulate a click in the center of the open area
        center_x = x + w // 2
        center_y = y + h // 2
        pyautogui.click(center_x, center_y)

    else:
        # No open area detected, continue with other actions or break the loop
        pass
