with open("C:\\Users\\Lenovo\\Desktop\\PythonFiles\\file1.txt", 'r+') as file:
    data = file.readlines()
    for line in data:
        word = line.split()
        print(word)
