import subprocess
import schedule
import time
import os

def open_app():
   
    app_path = r'C:\ProgramData\Microsoft\Windows\Start Menu\Programs\Google Chrome.lnk'
    subprocess.Popen([app_path], shell=True)

def close_app():
    
    app_name = 'chrome.exe'
    os.system(f'taskkill /f /im {app_name}')

#open time
schedule.every().day.at("21:41").do(open_app)

#close time
schedule.every().day.at("21:42").do(close_app)

#schedule.every().day.at("16:54").do(open_app)
#schedule.every().day.at("16:55").do(close_app)

while True:
    schedule.run_pending()
    time.sleep(1)
    print("working...")