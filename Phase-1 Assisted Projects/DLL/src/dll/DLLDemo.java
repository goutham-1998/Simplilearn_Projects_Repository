package dll;

public final class DLLDemo
{
   private static class Node
   {
      String name;
      Node next;
      Node prev;
   }

   public static void main(String[] args)
   {
      // Build a doubly-linked list.

      Node topForward = new Node();
      topForward.name = "A";
      Node temp = new Node();
      temp.name = "B";
      Node topBackward = new Node();
      topBackward.name = "C";
      topForward.next = temp;
      temp.next = topBackward;
      topBackward.next = null;
      topBackward.prev = temp;
      temp.prev = topForward;
      topForward.prev = null;

      // Dump forward singly-linked list.

      System.out.print("Forward singly-linked list: ");
      temp = topForward;
      while (temp != null)
      {
         System.out.print(temp.name);
         temp = temp.next;
      }
      System.out.println();

      // Dump backward singly-linked list.

      System.out.print("Backward singly-linked list: ");
      temp = topBackward;
      while (temp != null)
      {
         System.out.print(temp.name);
         temp = temp.prev;
      }
      System.out.println();

      // Reference node B.

      temp = topForward.next;

      // Delete node B.

      temp.prev.next = temp.next;
      temp.next.prev = temp.prev;

      // Dump forward singly-linked list.

      System.out.print("Forward singly-linked list (after deletion): ");
      temp = topForward;
      while (temp != null)
      {
         System.out.print(temp.name);
         temp = temp.next;
      }
      System.out.println();

      // Dump backward singly-linked list.

      System.out.print("Backward singly-linked list (after deletion): ");
      temp = topBackward;
      while (temp != null)
      {
         System.out.print(temp.name);
         temp = temp.prev;
      }
      System.out.println();
   }
}