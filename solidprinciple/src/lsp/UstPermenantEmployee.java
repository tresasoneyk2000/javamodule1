package lsp;

public class UstPermenantEmployee implements BasicDetails, PfDetails {

	@Override
	public void updatePfDetails() {
		System.out.println("Updated basic details");

	}

	@Override
	public void updateBasicDetails() {
		System.out.println("Updated Pf details");

	}

}
