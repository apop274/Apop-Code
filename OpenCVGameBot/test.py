#import cv2
#from tutorCore import Object
#
#player = Object('Objects/openSpace.png')
#scr = cv2.imread('Objects/knifeHitScreen.png')

#res = cv2.matchTemplate(scr, player.img, cv2.IM_CCOEFF_NORMED)
#minVal, maxVal, minLoc, maxLoc = cv2.minMaxLoc(res)

#startLoc = maxLoc
#endLoc = (startLoc[0]+player.width, startLoc[1]+player.height)

#if maxVal>0.8:
#    location = (startLoc, endLoc)
#else: 
#    loation = None

#first convert to BGR image
#scr = cv2.cvtColor(scr, location[0], location[1], (255, 0 ,0), 2)

#cv2.imshow('res', res)
#cv2.waitKey(0)