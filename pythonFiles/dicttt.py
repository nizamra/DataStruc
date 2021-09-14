fname = r"C:\Users\NIZAM\OneDrive\Desktop\DataStructuresCS1332x1\pythonFiles\mbox-short.txt"

# name = input("Enter file name: ")
fhandle = open(fname)

counts = dict()
for line in fhandle:
    words = line.split()
    for word in words:
        counts[word] = counts.get(word,0) + 1

def getBigO():
    biggerCount = None
    biggerWord = None
    for k,v in counts.items():
        if biggerCount is None or v > biggerCount:
            biggerCount = v
            biggerWord = k

    print(biggerWord,biggerCount)

def getBig10():
    lst = list()
    for k,v in counts.items():
        newTuple = (v, k)
        lst.append(newTuple)
    lst = sorted(lst, reverse=True)

    for v, k in lst[:10] :
        print(k,v)

getBig10()
# another way to getBig10 (oneLiner)
print( sorted( [ (v,k) for k,v in counts.items() ], reverse=True )[:10] )