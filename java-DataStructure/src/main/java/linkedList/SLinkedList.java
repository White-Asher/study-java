package linkedList;

import java.util.NoSuchElementException;

public class SLinkedList<E> {
    private Node<E> head;	// 노드의 첫 부분
    private Node<E> tail;	// 노드의 마지막 부분
    private int size;	// 요소 개수

    // 생성자
    public SLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public Node<E> search(int index){

        // 범위 밖(잘못된 위치) 일 경우 예외 던지기
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }

        Node<E> x = head; //head가 가리키는 노드부터 시작

        for(int i = 0; i<index; i++){
            x = x.next; // x노드의 다음 노드를 x에 저장한다
        }
        return x;
    }

    public void addFirst(E value){
        Node<E> newNode = new Node<E>(value);
        newNode.next = head;
        head = newNode;
        size++;

        if(head.next == null){
            tail = head;
        }
    }

    public void addLast(E value){
        Node<E> newNode = new Node<>(value);

        if (size == 0){
            addFirst(value);
            return;
        }

        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public boolean add(E value){
        addLast(value);
        return true;
    }

    public void add(int index, E value){
        // 잘못된 인덱스 참조시 예외 발생
        if(index > size || index < 0){
            throw new IndexOutOfBoundsException();
        }

        // 추가하려는 index가 가장 앞에 추가하려는 경우 addFirst 호출
        if(index == 0){
            addFirst(value);
            return;
        }

        if (index == 0){
            addLast(value);
            return;
        }

        Node<E> prevNode = search(index - 1);
        Node<E> nextNode = prevNode.next;
        Node<E> newNode = new Node<>(value);

        prevNode.next = null;
        prevNode.next = newNode;
        newNode.next = nextNode;
        size++;
    }

    public E remove(){
        Node<E> headNode = head;

        if(headNode == null){
            throw new NoSuchElementException();
        }

        // 삭제한 노드를 반환하기 위한 임시 변수
        E element = headNode.data;

        Node<E> nextNode = head.next;

        // head 노드의 데이터들을 모두 삭제
        head.data = null;
        head.next = null;

        // head가 다음 노드를 가리키도록 업데이트
        head = nextNode;
        size--;

        if (size == 0){
            tail = null;
        }
        return element;
    }

    public E remove(int index){

        // 삭제하려는 노드가 첫 번째 원소일 경우
        if(index == 0){
            return remove();
        }

        // 잘못된 범위 예외 처리
        if(index >= size || index < 0){
            throw new IndexOutOfBoundsException();
        }

        // 삭제할 노드의 이전 노드
        Node<E> prevNode = search(index - 1);
        // 삭제할 노드
        Node<E> removeNode = prevNode.next;
        // 삭제할 노드의 다음 노드
        Node<E> nextNode = removeNode.next;

        // 삭제되는 노드의 데이터를 반환하기 위한 임시변수
        E element = removeNode.data;

        // 이전 노드가 가리키는 노드를 삭제하려는 노드의 다음 노드로 변경
        prevNode.next = nextNode;

        // 만약 삭제했던 노드가 마지막 노드라면 tail을 prevNode로 갱신
        if(prevNode.next == null){
            tail = prevNode;
        }

        removeNode.next = null;
        removeNode.next = null;
        size--;

        return element;
    }

    public boolean remove(Object value){
        Node<E> prevNode = head;
        boolean hasValue = false;
        Node<E> x = head; // removeNode..

        // value와 일치하는 노드를 찾는다.
        for (; x != null ; x = x.next) {
            if(value.equals(x.data)){
                hasValue = true;
                break;
            }
            prevNode = x;
        }

        // 일치하는 요소가 없을 경우 false 반환
        if(x == null) {
            return false;
        }

        // 만약 삭제하려는 노드가 head라면 기존 remove() 사용
        if(x.equals(head)){
            remove();
            return true;
        }

        else{
            // 이전 노드의 링크를 삭제하려는 노드의 다음 노드로 연결
            prevNode.next = x.next;

            // 만약 삭제했던 노드가 마지막 노드라면 tail을 prevNode로 갱신
            if(prevNode.next == null){
                tail = prevNode;
            }
            x.data = null;
            x.next = null;
            size--;
            return true;
        }
    }

    public int indexOf(Object value){
        int index = 0;
        for(Node<E> x = head; x!= null; x = x.next){
            if(value.equals(x.data)){
                return index;
            }
            index++;
        }
        return -1;
    }


    public boolean contains(Object item){
        return indexOf(item) >= 0;
    }
}
