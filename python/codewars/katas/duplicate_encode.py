#The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if that character appears only once in the original string, or ")" if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.

def duplicate_encode(word):
    newStr = ""
    for i in word.lower():
        if word.lower().count(i) == 1:
            newStr += "("
        elif word.lower().count(i) > 1:
            newStr += ")"
    print(newStr)

#Another alternatives
    #return "".join(["(" if word.lower().count(c) == 1 else ")" for c in word.lower()])


    #word = word.lower()
    #return ''.join('(' if word.count(x) == 1 else ')' for x in word)


#Testing for word "ywGyHSxRmycd T"
#')()(()(((' should equal ')(()((((()(((('

word = "ywGyHSxRmycd T" # )(()((((()((((
word2 = "recede" #"()()()"
word3 = "Success" #")())())"
word4 = "(( @" #"))(("
duplicate_encode(word)
#duplicate_encode(word2)
#duplicate_encode(word3)
#duplicate_encode(word4)
