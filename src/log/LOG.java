package log;

import Save_Data.SaveLog;
import armazenador.IArmazenador;
import armazenador.VetDin;

public class LOG {
	
	SaveLog saveLOG;
	
	public LOG() {
		this.saveLOG = new SaveLog();
	}
	
	public void saveLOG(IArmazenador IALOG) {	
		
		Object vet_MENU[] = ((VetDin)IALOG).getVetor();

		saveLOG.saveData(vet_MENU);	
	}
}
