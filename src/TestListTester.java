import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * In dieser Klasse testen wir die Performance von LinkedList und ArrayList.
 * Sie werden beim Löschen, Hinzufügen und Ausgeben verglichen. Am Ende
 * wird ebenso kurz über String Verkettungen und StringBuilder geredet.
 * Die Methoden bzw. TestMethoden sind aus der ListTester Klasse.
 */
public class TestListTester {
	/**
	 * Die Tests finden in der Main Methode stadt.
	 * @param args commandline parameter
	 */
	public static void main(String[] args) {
		ListTester tester = new ListTester();
		int anzahl = 100000;

		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();

		long start, end;

		System.out.println("Elemten Anzahl: " + anzahl);

        try {
            // addEnd testen
            start = System.nanoTime();
            tester.addEnd(arrayList, anzahl);
            end = System.nanoTime();
            System.out.println("addEnd() - ArrayList: Zeit: " + (end - start) / 1_000_000.0 + " ms");

            start = System.nanoTime();
            tester.addEnd(linkedList, anzahl);
            end = System.nanoTime();
            System.out.println("addEnd() - LinkedList: Zeit: " + (end - start) / 1_000_000.0 + " ms\n");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryError: " + e.getMessage());
        } catch (Exception e) {
			System.out.println("komische Exception: " + e.getMessage());
		}

        try {
            // addFirst testen
            arrayList.clear();
            linkedList.clear();

            start = System.nanoTime();
            tester.addFirst(arrayList, anzahl);
            end = System.nanoTime();
            System.out.println("addFirst() - ArrayList: Zeit: " + (end - start) / 1_000_000.0 + " ms");

            start = System.nanoTime();
            tester.addFirst(linkedList, anzahl);
            end = System.nanoTime();
            System.out.println("addFirst() - LinkedList: Zeit: " + (end - start) / 1_000_000.0 + " ms\n");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryError: " + e.getMessage());
        }catch (Exception e) {
			System.out.println("komische Exception: " + e.getMessage());
		}

        int summeArrayList = 0;
        int summeLinkedList = 0;

        try {
            // Summe mit Iterator
            start = System.nanoTime();
            summeArrayList = tester.summeIterator(arrayList);
            end = System.nanoTime();
            System.out.println("Summe (Iterator) - ArrayList: " + summeArrayList + " | Zeit: " + (end - start) / 1_000_000.0 + " ms");

            start = System.nanoTime();
            summeLinkedList = tester.summeIterator(linkedList);
            end = System.nanoTime();
            System.out.println("Summe (Iterator) - LinkedList: " + summeLinkedList + " | Zeit: " + (end - start) / 1_000_000.0 + " ms\n");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }catch (Exception e) {
			System.out.println("komische Exception: " + e.getMessage());
		}

        try {
            // Summe mit Index
            start = System.nanoTime();
            summeArrayList = tester.summeIndex(arrayList);
            end = System.nanoTime();
            System.out.println("Summe (Index) - ArrayList: " + summeArrayList + " | Zeit: " + (end - start) / 1_000_000.0 + " ms");

            start = System.nanoTime();
            summeLinkedList = tester.summeIndex(linkedList);
            end = System.nanoTime();
            System.out.println("Summe (Index) - LinkedList: " + summeLinkedList + " | Zeit: " + (end - start) / 1_000_000.0 + " ms\n");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }catch (Exception e) {
			System.out.println("komische Exception: " + e.getMessage());
		}

        try {
            // Liste als String mit Iterator
            start = System.nanoTime();
            tester.listeIterator(arrayList);
            end = System.nanoTime();
            System.out.println("Liste (Iterator, String) - ArrayList: Zeit: " + (end - start) / 1_000_000.0 + " ms");

            start = System.nanoTime();
            tester.listeIterator(linkedList);
            end = System.nanoTime();
            System.out.println("Liste (Iterator, String) - LinkedList: Zeit: " + (end - start) / 1_000_000.0 + " ms\n");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }catch (Exception e) {
			System.out.println("komische Exception: " + e.getMessage());
		}

        try {
            // Liste als String mit Index
            start = System.nanoTime();
            tester.listeIndex(arrayList);
            end = System.nanoTime();
            System.out.println("Liste (Index, String) - ArrayList: Zeit: " + (end - start) / 1_000_000.0 + " ms");

            start = System.nanoTime();
            tester.listeIndex(linkedList);
            end = System.nanoTime();
            System.out.println("Liste (Index, String) - LinkedList: Zeit: " + (end - start) / 1_000_000.0 + " ms\n");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }catch (Exception e) {
			System.out.println("komische Exception: " + e.getMessage());
		}

        try {
            // Liste als String mit Iterator + StringBuilder
            start = System.nanoTime();
            tester.listeIteratorStringBuilder(arrayList);
            end = System.nanoTime();
            System.out.println("Liste (Iterator, StringBuilder) - ArrayList: Zeit: " + (end - start) / 1_000_000.0 + " ms");

            start = System.nanoTime();
            tester.listeIteratorStringBuilder(linkedList);
            end = System.nanoTime();
            System.out.println("Liste (Iterator, StringBuilder) - LinkedList: Zeit: " + (end - start) / 1_000_000.0 + " ms\n");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }catch (Exception e) {
			System.out.println("komische Exception: " + e.getMessage());
		}

        try {
            // Liste als String mit Index + StringBuilder
            start = System.nanoTime();
            tester.listeIndexStringBuilder(arrayList);
            end = System.nanoTime();
            System.out.println("Liste (Index, StringBuilder) - ArrayList: Zeit: " + (end - start) / 1_000_000.0 + " ms");

            start = System.nanoTime();
            tester.listeIndexStringBuilder(linkedList);
            end = System.nanoTime();
            System.out.println("Liste (Index, StringBuilder) - LinkedList: Zeit: " + (end - start) / 1_000_000.0 + " ms\n");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }catch (Exception e) {
			System.out.println("komische Exception: " + e.getMessage());
		}

        try {
            // Jede zweite Zahl löschen
            start = System.nanoTime();
            tester.deleteHalf(arrayList);
            end = System.nanoTime();
            System.out.println("deleteHalf() - ArrayList: Zeit: " + (end - start) / 1_000_000.0 + " ms");

            start = System.nanoTime();
            tester.deleteHalf(linkedList);
            end = System.nanoTime();
            System.out.println("deleteHalf() - LinkedList: Zeit: " + (end - start) / 1_000_000.0 + " ms\n");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }catch (Exception e) {
			System.out.println("komische Exception: " + e.getMessage());
		}
    }
}
