package Builder01;

public class AssemblyInstructionPageroCarBuilder implements CarBuilder {

	private AssemblyInstructions assemblyInstructions = new AssemblyInstructions();

	@Override
	public void reset() {
		assemblyInstructions = new AssemblyInstructions();
	}
	
	@Override
	public void buildEngine() {
		assemblyInstructions.setAssemblyEngine("Assembly engine Big 3.0");
	}

	@Override
	public void buildBodywork() {
		assemblyInstructions.setAssemblyBodywork("Assembly hard bodywork");;
	}

	@Override
	public void buildWheels() {
		assemblyInstructions.setAssemblyWhells("Assembly 17\" wheels");;
	}

	@Override
	public void buildSeats() {
		assemblyInstructions.setAssemblySeats("Assembly especial seats");;
	}
	
	public AssemblyInstructions createAssemblyInstructionsPageroCar() {
		AssemblyInstructions newAssemblyInstructions = assemblyInstructions;
		reset();
		return newAssemblyInstructions;
	}
	
}
