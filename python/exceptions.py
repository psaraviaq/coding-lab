#
# * try / except
try:
    age = int("24 years")
    print(age)
# except:
#     print("Something went wrong.")
except ValueError as e:
    print("Error:", e)
