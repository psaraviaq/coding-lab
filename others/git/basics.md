<!--^ git init -->
<!--& Initializes a Git repository in the current directory. -->
<!--~ It creates a hidden ".git" folder. When used again, nothing happens. -->

<!--^ git config --global user.name "___" -->
<!--^ git config --global user.email "___" -->
<!--& Configures Git to use a specific user name and email address. -->
<!--~ You can use it without arguments to see the current configuration. -->
<!--~ Or use it again with arguments to change their values. -->

<!--^ git add "___" -->
<!--& Chooses which file changes are included in the next commit. -->

<!--^ git commit -m "___" -->
<!--& Stores staged changes in the repository. -->
<!--~ Git creates a commit object in the repository (inside the ".git" folder). -->
<!--~ The commit object contains some information and a pointer to a tree (where the changes are actually stored). -->
<!--~ It also stores the ID of the previous commit, this unidirectional chain is called the commit history. -->

<!--^ git status -->
<!--& Checks the status of the files in the working directory. -->
