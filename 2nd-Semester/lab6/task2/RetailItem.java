class RetailItem {
		private String description;
		private int unitOnHands;
		private double price;

		public String getDescription(){
			return description;
		}

		public int getUnitOnHand(){
			return unitOnHands;
		}

		public double getPrice(){
			return price;
		}

		public RetailItem setDescription(String description){
			this.description = description;
			return this;
		}

		public RetailItem setUnitOnHands(int unitOnHands){
			this.unitOnHands = unitOnHands;
			return this;
		}

		public RetailItem setPrice(double price){
			this.price = price;
			return this;
		}

}
