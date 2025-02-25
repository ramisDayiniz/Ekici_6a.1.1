import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * In dieser Klasse wird Methoden für das Testen der Performance
 * von Linked und Array -List verwendet. Die Methoden sind zb.
 * Elemente hinzufügen, löschen und ausgeben
 * @author Ramis Ekici
 * @version 25-02-2025
 */
public class ListTester {

	/**
	 * Fügt eine bestimmte Anzahl an zufälligen Zahlen am Ende der Liste hinzu.
	 * @param list   Die Liste, in die die Zahlen eingefügt werden.
	 * @param anzahl Die Anzahl der hinzuzufügenden Zahlen.
	 * @throws NullPointerException      Falls die Liste null ist.
	 * @throws IllegalArgumentException Falls die Anzahl negativ ist.
	 * @throws OutOfMemoryError          Falls nicht genug Speicher vorhanden ist.
	 */
	public void addEnd(List<Integer> list, int anzahl)
			throws NullPointerException, IllegalArgumentException, OutOfMemoryError {

		if (list == null) {
			throw new NullPointerException("Die Liste darf nicht null sein.");
		}

		if (anzahl < 0) {
			throw new IllegalArgumentException("Die Anzahl der Elemente darf nicht negativ sein.");
		}

		Random random = new Random();
		for (int i = 0; i < anzahl; i++) {
			list.add(random.nextInt(11)); // o bis 10
		}
	}

	/**
	 * Fügt eine bestimmte Anzahl an zufälligen Zahlen am Anfang der Liste hinzu.
	 * @param list   Die Liste, in die die Zahlen eingefügt werden.
	 * @param anzahl Die Anzahl der hinzuzufügenden Zahlen.
	 * @throws NullPointerException Falls die Liste null ist.
	 * @throws IllegalArgumentException Falls die Anzahl negativ ist.
	 * @throws OutOfMemoryError Falls nicht genug Speicher vorhanden ist.
	 */
	public void addFirst(List<Integer> list, int anzahl)
		throws NullPointerException, IllegalArgumentException, OutOfMemoryError {

		if (list == null) {
			throw new NullPointerException("Die Liste darf nicht null sein.");
		}

		if (anzahl < 0) {
			throw new IllegalArgumentException("Die Anzahl der Elemente darf nicht negativ sein.");
		}

		Random random = new Random();
		for (int i = 0; i < anzahl; i++) {
			list.add(0, random.nextInt(11));
		}
	}

	/**
	 * Löscht alle die Hälfte aller Elemente der Liste.
	 * @param list   Die Liste, die in die Hälfte gelöscht werden.
	 * @throws NullPointerException Falls die Liste null ist.
	 */
	public void deleteHalf(List<Integer> list)
			throws NullPointerException {

		if (list == null) {
			throw new NullPointerException("Die Liste darf nicht null sein.");
		}

		Iterator<Integer> iterator = list.iterator();
		boolean remove = false;

		while (iterator.hasNext()) {
			iterator.next();
			if (remove) {
				iterator.remove();
			}
			remove = !remove;
		}
	}

	/**
	 *  diese Methode soll die Summe aller in der Liste gespeicherten Elemente mit
	 *  Hilfe eines Iterators berechnen und zurückgeben.
	 * @param list   Die Liste, die berechnet wird.
	 * @throws NullPointerException Falls die Liste null ist.
	 */
	public int summeIterator(List<Integer> list)
			throws NullPointerException {

		if (list == null) {
			throw new NullPointerException("Die Liste darf nicht null sein.");
		}

		Iterator<Integer> iterator = list.iterator();

		int summe = 0;
		while (iterator.hasNext()) {
			summe += iterator.next();
		}
		return summe;
	}


	/**
	 * Berechnet die Summe aller Elemente in der Liste mithilfe eines Index-basierten for-Loops.
	 * @param list Die Liste, die berechnet wird.
	 * @return Die Summe der Listenelemente.
	 * @throws NullPointerException Falls die Liste null ist.
	 */
	public int summeIndex(List<Integer> list) throws NullPointerException {
		if (list == null) {
			throw new NullPointerException("Die Liste darf nicht null sein.");
		}

		int summe = 0;
		for (int i = 0; i < list.size(); i++) {
			summe += list.get(i);
		}

		return summe;
	}

	/**
	 * Erstellt einen String, der alle Elemente der Liste enthält, getrennt durch ein Leerzeichen.
	 * @param list Die Liste mit den zu verarbeitenden Elementen.
	 * @return Ein String mit allen Listenelementen, getrennt durch Leerzeichen.
	 * @throws NullPointerException Falls die Liste null ist.
	 */
	public String listeIterator(List<Integer> list) throws NullPointerException {
		if (list == null) {
			throw new NullPointerException("Die Liste darf nicht null sein.");
		}

		String result = "";
		Iterator<Integer> iterator = list.iterator();

		while (iterator.hasNext()) {
			result += iterator.next() + " ";
		}

		return result.trim();
	}

	/**
	 * Erstellt einen String, der alle Elemente der Liste enthält, getrennt durch ein Leerzeichen.
	 * @param list Die Liste mit den zu verarbeitenden Elementen.
	 * @return Ein String mit allen Listenelementen, getrennt durch Leerzeichen.
	 * @throws NullPointerException Falls die Liste null ist.
	 */
	public String listeIndex(List<Integer> list) throws NullPointerException {
		if (list == null) {
			throw new NullPointerException("Die Liste darf nicht null sein.");
		}

		String result = "";
		for (int i = 0; i < list.size(); i++) {
			result += list.get(i) + " ";
		}

		return result.trim(); // Entfernt das letzte Leerzeichen
	}


	/**
	 * Erstellt einen String, der alle Elemente der Liste enthält, getrennt durch ein Leerzeichen.
	 * Verwendet einen StringBuilder für eine effizientere Verkettung.
	 * @param list Die Liste mit den zu verarbeitenden Elementen.
	 * @return Ein String mit allen Listenelementen, getrennt durch Leerzeichen.
	 * @throws NullPointerException Falls die Liste null ist.
	 */
	public String listeIteratorStringBuilder(List<Integer> list) throws NullPointerException {
		if (list == null) {
			throw new NullPointerException("Die Liste darf nicht null sein.");
		}

		StringBuilder sb = new StringBuilder();
		Iterator<Integer> iterator = list.iterator();

		while (iterator.hasNext()) {
			sb.append(iterator.next()).append(" ");
		}

		return sb.toString().trim(); // Entfernt das letzte Leerzeichen
	}

	/**
	 * Erstellt einen String, der alle Elemente der Liste enthält, getrennt durch ein Leerzeichen.
	 * Verwendet eine for-Schleife mit Index und StringBuilder für bessere Performance.
	 * @param list Die Liste mit den zu verarbeitenden Elementen.
	 * @return Ein String mit allen Listenelementen, getrennt durch Leerzeichen.
	 * @throws NullPointerException Falls die Liste null ist.
	 */
	public String listeIndexStringBuilder(List<Integer> list) throws NullPointerException {
		if (list == null) {
			throw new NullPointerException("Die Liste darf nicht null sein.");
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i)).append(" ");
		}

		return sb.toString().trim();
	}


}
