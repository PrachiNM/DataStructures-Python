class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None


def insert_level_order(array, root, i, n):
    if i < n:
        temp = Node(array[i])
        root = temp

        root.left = insert_level_order(array, root.left, 2*i+1, n)

        root.right = insert_level_order(array, root.right, 2*i+2, n)

    return root


def delete_deepest(root):
    temp = None
    if root.right:
        delete_deepest(root.right)
    elif root.left:
        delete_deepest(root.left)
    else:
        temp = root
        root = None
    return temp


def delete_node(root, value):
    if root is None:
        return None
    queue = [root]
    while queue:
        node = queue.pop(0)
        if node.left is not None:
            queue.append(node.left)
        if node.right is not None:
            queue.append(node.right)
        if node.data == value:
            temp = delete_deepest(root)
            node = temp
    return root


def inorder_print(root):

    if root is not None:
        inorder_print(root.left)
        print(root.data, end=' ')
        inorder_print(root.right)


def preorder_print(root):
    if root is not None:
        print(root.data, end=' ')
        preorder_print(root.left)
        preorder_print(root.right)


def postorder_print(root):
    if root is not None:
        postorder_print(root.left)
        postorder_print(root.right)
        print(root.data, end=' ')


if __name__ == '__main__':
    array = [1, 2, 3, 4, 5, 6, 7, 8]
    root = None
    root = insert_level_order(array, root, 0, len(array))
    print('before deletion')
    inorder_print(root)
    delete_node(root, 4)
    print('after deletion')
    inorder_print(root)




