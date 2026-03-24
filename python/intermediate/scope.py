if 2 > 1:
    x = "why"
print(x)

# * "global" makes a variable available outside the function
username = ""


def set_username():
    # ! Without it, the variable wouldn't be overwritten
    global username
    username = "Pedro"


set_username()
print(username)


# * "nonlocal" makes a variable available outside the inner function
def set_password():
    password = "berries"

    def hash_password():
        # ! Without it, the variable wouldn't be overwritten as well
        nonlocal password
        password = "03f8d7a"

    hash_password()
    print(password)


set_password()
