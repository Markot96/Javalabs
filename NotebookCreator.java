package ua.lviv.iot;

public class NotebookCreator {

	public static void main(String[] args) {
		
		Notebook schoolNotebook = new Notebook();
		
		Notebook homeNotebook = new Notebook("Yellow", 96, 140.17, 2019, "Poland", 297, 210);
		
		Notebook workNotebook = new Notebook("Blue", 72, 50.96, 2017);
		
		System.out.println(schoolNotebook);
		
		System.out.println(homeNotebook);
		
		System.out.println(workNotebook);
		
		Notebook.printStaticDENSITY_IN_GRAMMS_PER_SQUARE_METER();
		
		homeNotebook.printDENSITY_IN_GRAMMS_PER_SQUARE_METER();
		
		System.out.println();
		
		
		int quantityOfObjectsInArray = 4;
        Notebook[] notebooks = new Notebook[quantityOfObjectsInArray];
        for (int arrayIterator = 0; arrayIterator < quantityOfObjectsInArray; arrayIterator++) {
        	notebooks[arrayIterator] = new Notebook();
        }

        for (Notebook notebook : notebooks) {
            System.out.println(notebook);
        }
		
	}

}
//"sd", 1, 2, 3, "gds", 1, 2
//System.out.println(DENSITY_IN_GRAMMS_PER_SQUARE_METER);