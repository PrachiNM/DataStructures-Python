# Insert data at first available position


class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None


def insert(root, data):
    if root is None:
        root = Node(data)
        return root

    queue = [root]

    while len(queue) > 0:
        temp = queue.pop(0)
        if temp.left:
            queue.append(temp.left)
        else:
            temp.left = Node(data)
            break
        if temp.right:
            queue.append(temp.right)
        else:
            temp.right = Node(data)
            break
    return root


def inorder_print(root):
    if root.left:
        inorder_print(root.left)
    print(root.data, end=' ')
    if root.right:
        inorder_print(root.right)


if __name__ == '__main__':
    root = Node(10)
    root.left = Node(11)
    root.left.left = Node(7)
    root.right = Node(9)
    root.right.left = Node(15)
    root.right.right = Node(8)

    inorder_print(root)
    print()
    insert(root, 12)
    inorder_print(root)
    print()

