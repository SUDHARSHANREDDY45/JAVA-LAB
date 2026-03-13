class Cricket {
  String playerName;
  String teamName;
  double battingAverage;
  Cricket(String playerName,String teamName,double battingAverage) {
    this.playerName=playerName;
    this.teamName=teamName;
    this.battingAverage=battingAverage;
  }
  void display() {
    System.out.println("Name is : "+playerName);
    System.out.println("Team name is "+teamName);
    System.out.println("Batting Average is : "+battingAverage);
  }
}
