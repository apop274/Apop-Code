import numpy as np
import cv2
import os
import pyautogui 

# Set the screen dimensionsq
screen_width, screen_height = pyautogui.size()

# Create a loop to continuously capture frames
while True:
    # Capture the screen frame
    screenshot = pyautogui.screenshot()

    # Convert the screenshot to a NumPy array
    frame = np.array(screenshot)

    # Convert the BGR image to RGB
    frame_rgb = cv2.cvtColor(frame, cv2.COLOR_BGR2RGB)

    # Iterate through all pixels in the frame
    for y in range(screen_height):
        for x in range(screen_width):
            # Get the pixel value at (x, y)
            pixel = frame_rgb[y, x]



            # Process the pixel here (e.g., game bot logic)
            # ...

            # Update the pixel value if needed
            # frame_rgb[y, x] = updated_value

    # Show the frame
    cv2.imshow("Live Capture", frame_rgb)

    # press 'q' to end
    if cv2.waitKey(1) == ord("q"):
        break

# Release resources and close windows
cv2.destroyAllWindows()
