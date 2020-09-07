import re
#ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
#If the function is passed a valid PIN string, return true, else return false.


def validate_pin(pin):
    #return true or false
    # ^ Matchs the start of the string, in Multiline also matches immediately after each newline
    # $ Matches the end of the String, in MULTILINE mode also matches before a newline
    # {} Specifies that exactly m copies of the previous RE should be matched
    res = re.findall("^[0-9]{4}$|^\\d{6}$|$", pin, re.MULTILINE)
    if len(res) == 2 and len(str(res[0])) >= 4:
        return True
    return False

# BEST SOLUTION: return len(pin) in (4, 6) and pin.isdigit()

print(validate_pin("123\n"))
print(validate_pin("1234"))
print(validate_pin("123456"))
print(validate_pin("1234A6"))
print(validate_pin("12345"))
print(validate_pin("1234\n"))
validate_pin("1234")