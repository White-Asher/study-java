package w4.hw2;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("연결리스트 테스트")
class LinkedListTest {
    private LinkedList list;
    private ListNode head;

    @BeforeAll
    void init() {
        list = new LinkedList();
        head = list.add(null, new ListNode(1), 0);
        head = list.add(head, new ListNode(3), 1);
        head = list.add(head, new ListNode(5), 2);
        head = list.add(head, new ListNode(7), 3);
    }

    @Test
    @DisplayName("노드 추가 테스트")
    void addTest() {
        assertAll("노드 추가 오류",
                () -> {// init()에서 생성한 linkedlist를 확인
                    assertEquals("1,3,5,7", list.printString(head));
                },
                () -> {// 허용범위를 벗어난 position에 add하려는 경우
                    Exception exception = assertThrows(IndexOutOfBoundsException.class, () ->
                            list.add(head, new ListNode(9), list.listSize(head) + 1));
                }
        );
    }
}