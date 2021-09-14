fileName=input("Provide the file's name please: ")
try:
    fhandle = open(fileName)
except:
    print(f"file {fileName} isn't there..")
    quit()


fileHandle = open('someMail.txt')
lineCount = 0
for line in fileHandle:
    lineCount+=1
    line = line.strip()
    if line.startswith("From: "):
        print(line)
print(lineCount)

reader = fileHandle.read()
chars = len(reader)
print(chars[13:34])
