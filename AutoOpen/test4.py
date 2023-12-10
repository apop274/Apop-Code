import subprocess
import time

def run_bat_file():
    # Replace 'your_file.bat' with the actual name of your batch file
    bat_file_path = 'your_file.bat'
    
    # Open the batch file
    subprocess.Popen([bat_file_path], shell=True)

    # Wait for some time (e.g., 5 seconds)
    time.sleep(5)

    # Close the batch file
    subprocess.Popen(['taskkill', '/f', '/im', 'cmd.exe'], shell=True)

# Schedule the execution at a specific time
scheduled_time = "14:30"  # Replace with your desired time in HH:mm format

while True:
    current_time = time.strftime("%H:%M")
    
    if current_time == scheduled_time:
        run_bat_file()
        break

    # Check every minute
    time.sleep(60)
