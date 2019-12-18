package mvnpr;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class testComparator {

	@Test
	public void testObtenirTarif() {
		List<Porte> list = new ArrayList<Porte>();
	    Porte p1 = new PorteEntree(1);
	    Porte p2 = new PorteSortie(2);
	    Porte p3 = new PorteEntree(3);
	    Porte p4 = new PorteSortie(4);

	    list.add(p4);
	    list.add(p3);
	    list.add(p1);
	    list.add(p2);

	    Collections.sort(list, new OrdrePorteComparator());

	    assertEquals("V�rification des items de la liste", Integer.valueOf(1), list.get(0).getNumeroDePorte());
	    assertEquals("V�rification des items de la liste", Integer.valueOf(2), list.get(1).getNumeroDePorte());
	    assertEquals("V�rification des items de la liste", Integer.valueOf(3), list.get(2).getNumeroDePorte());
	    assertEquals("V�rification des items de la liste", Integer.valueOf(4), list.get(3).getNumeroDePorte());

	}

}