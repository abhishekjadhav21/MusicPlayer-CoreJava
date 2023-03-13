package multiplayer;

public class Song {
	private int id;
	private String songName;
	private String singerName;
	private String moveName;
	private double duration;

	

	
	


	public Song(int id, String songName, String singerName, String moveName, double duration) {
		super();
		this.id = id;
		this.songName = songName;
		this.singerName = singerName;
		this.moveName = moveName;
		this.duration = duration;
	}
	public int getId() {
		return id;
	}
	public void setId(String songName,String singerName,String moveName,double duration) {
		this.songName = songName;
		this.singerName = singerName;
		this.moveName = moveName;
		this.duration = duration;
		
	
	}
	
	




	@Override
	public String toString() {
		return "Song id:" + id + " \nsongName:" + songName + " \nsingerName:" + singerName + " \nmoveName=" + moveName
				+ "\nduration=" + duration;
	}

}
