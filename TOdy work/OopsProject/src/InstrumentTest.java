
public class InstrumentTest {

	public static void main(String[] args) {
		
		Guitar guitar = new Guitar();
		guitar.use();
		guitar.tuneStrings();
		guitar.play();
		guitar.pluck();
		 
		System.out.println("=======================");
		
		Violin violin = new Violin();
		violin.use();
		violin.tuneStrings();
		violin.play();
		violin.bowing();
		
		System.out.println("=======================");
		
		ElectronicGuitar eleGuitar = new ElectronicGuitar();
		eleGuitar.use();
		eleGuitar.tuneStrings();
		eleGuitar.play();
		eleGuitar.pluck();
		eleGuitar.preset();
		
		System.out.println("=======================");
		
		Cello cello = new Cello();
		cello.use();
		cello.tuneStrings();
		cello.play();
		cello.bowing();
		cello.longBowing();
		
		System.out.println("=======================");
		
		Fluet fluet = new Fluet();
		fluet.use();
		fluet.play();
		fluet.blowAir();
		fluet.smoothBlowAir();
		
		System.out.println("=======================");
		
		Harmonium harmonium = new Harmonium();
		harmonium.use();
		harmonium.play();
		harmonium.blowAir();
		harmonium.ReedVibrate();
		
		System.out.println("=======================");
		
		Tabla tabla = new Tabla();
		tabla.use();
		tabla.play();
		tabla.tuneSurface();
		tabla.applyPowder();
		
		System.out.println("=======================");
		
		Dhol dhol = new Dhol();
		dhol.use();
		dhol.play();
		dhol.tuneSurface();
		dhol.dholeSticks();
		
		System.out.println("=======================");
		
		SurgicalCutter surgicalCutter = new SurgicalCutter();
		surgicalCutter.use();
		surgicalCutter.sterile();
		surgicalCutter.operate();
		surgicalCutter.cutter();
		
		System.out.println("=======================");
		
		SurgicalNeedle needle = new SurgicalNeedle();
		needle.use();
		needle.sterile();
		needle.operate();
		needle.blood();
		
		System.out.println("=======================");
		
		Glucometer glucometer=new Glucometer();
		glucometer.use();
		glucometer.operate();
		glucometer.reader();
		glucometer.sugarLevel();
		
		System.out.println("=======================");
		
		ECGMachine ecgMachine = new ECGMachine();
		ecgMachine.use();
		ecgMachine.operate();
		ecgMachine.reader();
		ecgMachine.waves(); 
	}

}

interface Instrument
{
	void use(); // public and abstract
}


abstract class MusicalInstrument implements Instrument
{
	abstract void play();
}


abstract class StringBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneStrings();
}

abstract class AirBasedMusicalInstrument extends MusicalInstrument
{
	abstract void blowAir();
}

abstract class DrumBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneSurface();
}

class Guitar extends StringBasedMusicalInstrument{


	public void use() {
		System.out.println("Using Guitar ");
	}
	void play() {
		System.out.println("Playing Guitar ");
	}
	void tuneStrings() {
		System.out.println("Tuning Strings of Guitar ");
	}
	void pluck() {
		System.out.println("Plucking Strings of Guitar ");
	}
}

class ElectronicGuitar extends Guitar{
	public void use() {
		System.out.println("Using Electronic Guitar ");
	}
	void play() {
		System.out.println("Playing Electronic Guitar ");

	}
	void tuneStrings() {
		System.out.println("Tuning Strings of Electronic Guitar ");

	}
	void pluck() {
		System.out.println("Plucking Strings of Electronic Guitar ");
	}
	void preset() {
		System.out.println("Electronic Guitar is Preset");
	}
}

class Violin extends StringBasedMusicalInstrument
{
	public void use() {
		System.out.println("Using Violin ");
	}
	void play() {
		System.out.println("Playing Violin ");
	}
	void tuneStrings() {
		System.out.println("Tuning Strings of Violin ");
	}
	void bowing() {
		System.out.println("Bowing Strings of Violin ");
	}
}

class Cello extends Violin{
	public void use() {
		System.out.println("Using Cello ");
	}
	void play() {
		System.out.println("Playing Cello ");

	}
	void tuneStrings() {
		System.out.println("Tuning Strings of Cello ");

	}
	void bowing() {
		System.out.println("Bowing Strings of Cello ");
	}
	void longBowing() {
		System.out.println("LongBowing Cello ");
	}
}

class Fluet extends AirBasedMusicalInstrument{
	public void use(){
		System.out.println("Using fluet ");
	}
	
	void play() {
		System.out.println("Playing with fluet ");
	}
	
	void blowAir() {
		System.out.println("Blowing air in fluet ");
	}
	
	void smoothBlowAir() {
		System.out.println("by blowing air smoothly getting plesant sound ");
	}
	
	
}


class Harmonium extends AirBasedMusicalInstrument{
	public void use(){
		System.out.println("Using harmonium ");
	}
	
	void play() {
		System.out.println("Playing harmonium ");
	}
	
	void blowAir() {
		System.out.println("Blowing air in harmonium ");
	}
	
	void ReedVibrate() {
		System.out.println("Harmonium producing Reed Vibrate sound ");
	}
}


class Tabla extends DrumBasedMusicalInstrument{
	public void use(){
		System.out.println("Using tabla ");
	}
	
	void play() {
		System.out.println("Playing tabla ");
	}
	
	void tuneSurface() {
		System.out.println("Tuning surface of tabla ");
	}
	
	void applyPowder() {
		System.out.println("Applying powder on tabla to make it smoother  ");
	}
}

class Dhol extends DrumBasedMusicalInstrument{
	public void use(){
		System.out.println("Using Dhol ");
	}
	
	void play() {
		System.out.println("Playing Dhol ");
	}
	
	void tuneSurface() {
		System.out.println("Tuning surface of Dhol ");
	}
	
	void dholeSticks() {
		System.out.println("Sticksof dhol are broad ..");
	}
}


abstract class MedicalInstrument implements Instrument
{
	abstract void operate();
}

abstract class SurgicalInstrument extends MedicalInstrument{
	abstract void sterile();
}

abstract class PathalogicalInstrument extends MedicalInstrument{
	abstract void reader();
}

class SurgicalCutter extends SurgicalInstrument{
	public void use() {
		System.out.println("Using surgical cutter ");
	}
	
	void operate() {
		System.out.println("Operating surgical cutter ");

	}
	
	void sterile() {
		System.out.println("Sterilize surgical cutter ");
	}
	
	void cutter() {
		System.out.println("surgical cutter is used during operation ");
	}
}

class SurgicalNeedle extends SurgicalInstrument{
	public void use() {
		System.out.println("Using surgical needle ");
	}
	
	void operate() {
		System.out.println("Operating surgical needle ");

	}
	
	void sterile() {
		System.out.println("Sterilize surgical needle ");
	}
	
	void blood() {
		System.out.println("Taking blood using surgical needle ");
	}
}


class Glucometer extends PathalogicalInstrument{
	public void use() {
		System.out.println("Using glucometer ");
	}
	
	void operate() {
		System.out.println("Operating glucometer ");
	}
	
	void reader() {
		System.out.println("Reading data on glucometer ");
	}
	
	void sugarLevel() {
		System.out.println("glucometer is measuring the sugar level ");
	}
}

class ECGMachine extends PathalogicalInstrument{
	public void use() {
		System.out.println("Using ECG Machine ");
	}
	
	void operate() {
		System.out.println("Operating ECG Machine ");
	}
	
	void reader() {
		System.out.println("Reading daata from ECG Machine ");
	}
	
	void waves() {
		System.out.println("The waves on an ECG are S wave, V wave");
	}
}

