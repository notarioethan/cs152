import re

def isPhoneNumber(str):
    x = re.search(r"\d{3}-\d{3}-\d{4}", str) # match object
    if (x == None):
        #print("No phone number found")
        return False
    #phoneNumber = x.group() # string containing phone number
    #print(phoneNumber)
    return True

def printNumbers(str): #outputs all numbers
    x = re.findall(r"\d{3}-\d{3}-\d{4}", str) # array
    out = ""
    for i in range(len(x)):
        out += x[i] + "   " 
    print(out)
    

testString1 = "415-555-4242"
testString2 = "My number is 415-555-4242."
testString3 = "0415-555-4242"
testString4 = "415-555-42420"
testString5 = "0415-555-42420"
testString6 = "415-555-4242 and 555-555-5555"
if (isPhoneNumber(testString1)):
    printNumbers(testString1)
if (isPhoneNumber(testString2)):
    printNumbers(testString2)
if (isPhoneNumber(testString3)):
    printNumbers(testString3)
if (isPhoneNumber(testString4)):
    printNumbers(testString4)
if (isPhoneNumber(testString5)):
    printNumbers(testString5)
if (isPhoneNumber(testString6)):
    printNumbers(testString6)