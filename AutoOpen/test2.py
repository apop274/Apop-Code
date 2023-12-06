import subprocess
import schedule
import time
import os

#path of application
app_path = r'C:\ProgramData\Microsoft\Windows\Start Menu\Programs\Google Chrome.lnk'

#name of application
app_name = 'chrome.exe'

running = True

def open_app():
    subprocess.Popen([app_path], shell=True)


def close_app():
    os.system(f'taskkill /f /im {app_name}')


#open time
schedule.every().day.at("14:30").do(open_app)

#close time
schedule.every().day.at("14:31").do(close_app)



try:
    while running:
        schedule.run_pending()
        time.sleep(1)
except KeyboardInterrupt:
    print("Program has been stopped.")
