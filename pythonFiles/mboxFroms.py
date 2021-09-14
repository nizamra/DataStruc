fname = r"C:\Users\NIZAM\OneDrive\Desktop\DataStructuresCS1332x1\pythonFiles\mbox-short.txt"
try:
    fh = open(fname)
except IOError as error:
    print(error)
counter = 0
# FROM CWEN@IUPUI.EDU THU JAN  3 16:34:40 2008
for ll in fh:
    if ll.startswith('From '):
        counter +=1
        print(ll.strip().split()[1].split('@')[1])
print(counter)