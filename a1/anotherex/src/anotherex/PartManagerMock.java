package anotherex;

public class PartManagerMock implements PARTMANAGER{

	public int partNumber;
	public int quantity;
	public DeliveryAddress address;
	
	public PartManagerMock() {
		super();
	}

	public PartManagerMock(int partNumber, int quantity, DeliveryAddress address) {
		super();
		this.partNumber = partNumber;
		this.quantity = quantity;
		this.address = address;
	}
	
	public PartResponse SubmitPartForManufactureAndDelivery(int partNumber, int quantity, DeliveryAddress deliveryAddress){
		
		if (partNumber == 1111){return PartResponse.OUT_OF_STOCK;}
		else if(partNumber == 2222){return PartResponse.NO_LONGER_MANUFACTURED;}
		else
			return PartResponse.Success;
		
	}

	public int getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(int partNumber) {
		this.partNumber = partNumber;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public DeliveryAddress getAddress() {
		return address;
	}

	public void setAddress(DeliveryAddress address) {
		this.address = address;
	}
	

}
