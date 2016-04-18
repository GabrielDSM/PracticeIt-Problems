public class LinkedListProblems {
   public void set(int index, int value) {
    ListNode curr = front;
    for (int i = 0; i < index; i++) {
        curr = curr.next;
    }
    curr.data = value;
}
}