import numpy as np
import cv2
from PIL import ImageGrab


class Object:
    def __init__(self, path) -> None:
        img = cv2.imread(path, 0)
        self.img = img
        self.width = img.shape[1]
        self.height = img.shape[0]
        self.location = None

def grabScreen(bbox = None):
 img = ImageGrab.grab(bbox = bbox)
 img = np.array(img)
 img = cv2.cvtColor(img, cv2.COLOR_RGB2BGR)
 return img