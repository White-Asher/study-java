package w4.hw2Answer;

import org.junit.jupiter.api.*;
import w4.hw2.ListNode;
import w4.hw2Answer.LinkedListImpl;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("연결리스트 테스트")
public class LinkedListImplTest {
    private LinkedListImpl list;
    private ListNode head;

    @BeforeAll
    void init() {
        list = new LinkedListImpl();
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
                    assertEquals("1,3,5,7", list.toString(head));
                },
                () -> {// 허용범위를 벗어난 position에 add하려는 경우
                    Exception exception = assertThrows(IndexOutOfBoundsException.class, () ->
                            list.add(head, new ListNode(9), list.getSize(head) + 1));
                }
        );
    }

    @Test
    @DisplayName("노드 제거 테스트")
    void removeTest() {
        assertAll("노드 제거 오류",
                () -> {// 연결리스트(1,3,5,7)에서 위치가 3(idx 기준)인 node 삭제
                    assertEquals("1,3,5", list.toString(list.remove(head, 3)));
                },
                () -> {// 허용범위를 벗어난 position의 노드를 remove하려는 경우
                    Exception exception = assertThrows(IndexOutOfBoundsException.class, () ->
                            list.remove(head, list.getSize(head)));
                });
    }

    @Test
    @DisplayName("노드 포함 테스트")
    void containsTest() {
        assertAll("노드 포함 오류",
                () -> {// 연결리스트(1,3,5,7)가 1을 포함하는지 확인
                    assertTrue(list.contains(head, new ListNode(1)));
                },
                () -> {// 연결리스트(1,3,5,7)가 11을 포함하지 않는지 확인
                    assertFalse(list.contains(head, new ListNode(11)));
                });
    }
}