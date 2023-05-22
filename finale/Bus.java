class Bus extends Car {
  public Bus(int[] numSeatsPerRow) {
      super(2, (2 * numSeatsPerRow.length) - 1, numSeatsPerRow);
  }

  public Bus(Person driver, int[] numSeatsPerRow) throws InvalidDriverException{
    this(numSeatsPerRow);
    super.setDriver(driver);
  }

  //  @Override
  //   public boolean canOpenDoor(Person p) {
  //       if (p.getAge() > 5 && p.getHeight() > 40) {
  //           int lastPopulatedRow = getLastPopulatedRow();
  //           return p == getDriver() || getRowOfPerson(p) == lastPopulatedRow;
  //       }
  //       return false;
  //   }

    @Override
    public boolean canOpenWindow(Person p) {
        return super.canOpenWindow(p) && p.getAge() > 5;
    }

    @Override
    public String toString() {
        return "Bus is an extension of " + super.toString();
    }

    // @Override
    // public boolean loadPassenger(Person p) {
    //     int lastPopulatedRow = getLastPopulatedRow();
    //     if (p.getAge() >= 5 && p.getHeight() >= 36 && lastPopulatedRow >= 0) {
    //         return loadPassenger(p, lastPopulatedRow);
    //     }
    //     return false;
    // }

    // @Override
    // public int loadPassengers(Person[] peeps) {
    //     int count = 0;
    //     int lastPopulatedRow = getLastPopulatedRow();
    //     if (lastPopulatedRow < 0) {
    //         return count;
    //     }
    //     for (Person p : peeps) {
    //         if (p.getAge() >= 5 && p.getHeight() >= 36) {
    //             if (loadPassenger(p, lastPopulatedRow)) {
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }

    // private boolean loadPassenger(Person p, int row) {
    //     int seatsInRow = getNumberOfSeatsInRow(row);
    //     for (int i = 0; i < seatsInRow; i++) {
    //         if (getPassenger(row, i) == null) {
    //             setPassenger(row, i, p);
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // private int getLastPopulatedRow() {
    //     int numRows = getNumberOfRows();
    //     for (int row = numRows - 1; row >= 0; row--) {
    //         if (isRowPopulated(row)) {
    //             return row;
    //         }
    //     }
    //     return -1;
    // }

    private int getNumberOfRows() {
        int numRows = getSeatConfiguration().length;
        return numRows > 0 ? numRows : 0;
    }

    // private int getRowOfPerson(Person p) {
    //     int numRows = getNumberOfRows();
    //     for (int row = 0; row < numRows; row++) {
    //         for (int seat = 0; seat < getNumberOfSeatsInRow(row); seat++) {
    //             if (getPassenger(row, seat) == p) {
    //                 return row;
    //             }
    //         }
    //     }
    //     return -1;
    // }


  @Override
  public String departure() {
      return super.departure() + "The Bus\n";
  }


  @Override
  public String arrival() {
      return super.arrival() + "Of The Bus\n";
  }


  @Override
  public String doNotDisturbTheDriver() {
      return super.doNotDisturbTheDriver() + "On The Bus\n";
  }
}
