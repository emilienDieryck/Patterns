package implementations;

import interfaces.Observer;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AnalyseurDeTexte {

	private List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer) {
		observerList.add(observer);
	}

	public void removeObserver(Observer observer) {
        observerList.remove(observer);
	}

	public void readObservers(BufferedReader bufferedReader) {
		String line = null;
		try {
			while ((line = bufferedReader.readLine()) != null) {
				for (Observer observer : observerList) {
					observer.update(line);
				}
			}
		} catch (IOException e) {
			System.out.println("Erreur de lecture");
		}
	}
}
