package multiplayer;

import java.util.ArrayList;
import java.util.Scanner;

public class SongOperation {

	static ArrayList<Song> songs = new ArrayList<Song>();
	static int size;
	static Song song[] = new Song[size];
	Song song2 = new Song(size, null, null, null, size);

	Scanner inScanner = new Scanner(System.in);

	// Chose song to play
	public void choseToPlaySong() {
		System.out.println("Playing song...please wait");
		System.out.println("loading song list....");
		if (songs.size() == 0) {
			System.out.println("No song found in list... \\nPlease add songs first..\\n");
			return;

		}

		System.out.println("\nWhich song you want to play ?\nPlease enter Song Number (Enter '0' Zero to exit):- ");
		int songNumber = inScanner.nextInt();
		try {
			if (songNumber == 0) {
				System.out.println("");

			} else {
				System.out.println(songs.get(songNumber - 1));
			}

		} catch (IndexOutOfBoundsException e) {
			System.out.println("\nSong Number Not present in list\n");

		}

	}

	// Playing all song
	public void playAllSong() {
		System.out.println("playing all songs ........please waite");
		System.out.println("Loading song list");
		if (songs.size() == 0) {
			System.out.println("No song fount .......please add songs first");

		} else {
			try {
				for (int i = 0; i <= songs.size() - 1; i++) {
					System.out.println(songs.get(i));
					Thread.sleep(10000);
				}
			} catch (Exception e) {
				System.out.println("Loading next song...");
			}
		}
	}

	// Playing random song
	public void playRandomSong() {
		try {
			System.out.println("LOading song list ...Please wait");
			System.out.println("Playing Random Song.....\n");
			if (songs.size() == 0) {
				System.out.println("No song found in list... \\nPlease add songs first..\\n");
			} else {
				double randomNumber = Math.random() + 1;
				int randomNumber1 = (int) randomNumber;
				System.out.println("playing Song Number " + randomNumber1);
				System.out.println(songs.get(randomNumber1 - 1));

			}
		} catch (Exception e) {
			System.out.println("Exception in playRandomSong()");
		}
	}

	// Adding song
	public void addSong() {
		try {
			System.out.println("Adding Song In List.......");
			System.out.println("Enter how many song you want to add");
			size = inScanner.nextInt();
			if (size == 0) {
				System.out.println("");

			}
			Song song[] = new Song[size];
			for (int i = 0; i < size; i++) {
				System.out.println("Enter song number" + (i + 1));

				System.out.println("Enter song details(id,songName,singerName,moveName,Duration):-");
				System.out.println("Enter song id:-");
				int id = inScanner.nextInt();
				System.out.println("Enter Song Name:-");
				String songName = inScanner.next();
				System.out.println("Enter Singer Name:-");
				String singerName = inScanner.next();
				System.out.println("Enter Move Name:-");
				String moveName = inScanner.next();
				System.out.println("Enter Song Duration:-");
				double duration = inScanner.nextDouble();
				song[i] = new Song(id, songName, singerName, moveName, duration);

				songs.add(song[i]);

			}
		} catch (Exception e) {
			System.out.println("plese enter valid input");
		}

	}

	// Removing Song
	public void removeSong() {
		System.out.println("Removing Song...");
		System.out.println("Loading Song list....");
		if (songs.size() == 0) {
			System.out.println("No song presenet in list \\nPlease add songs before removing..\\n");

		} else {
			for (int i = 0; i <= songs.size() - 1; i++) {
				System.out.println(songs.get(i));
			}
			System.out.println("Enter song number you want to remove..");
			int removeSong = inScanner.nextInt();
			if (removeSong == 0) {
				System.out.println("");
				return;
			} else {
				songs.remove(removeSong - 1);
				System.out.println("Song was removed....\n");
			}

		}
	}

	// Updating song
	public void updateSong() {
		System.out.println("Updating song....");
		System.out.println("loading song list...");
		if (songs.size() == 0) {
			System.out.println("No song Found .....Please first add song before Update");
		} else {
			System.out.println("Which song you want to update ? provide its number.. ");
			int updateSong = inScanner.nextInt();

			System.out.println(songs.get(updateSong - 1));

			System.out.println("Enter updated SongName:-");
			String songName = inScanner.next();
			System.out.println("Enter updated Singer Name:-");
			String singerName = inScanner.next();
			System.out.println("Enter updated MoveName:-");
			String moveName = inScanner.next();
			System.out.println("Enter updated Duration");
			double duration = inScanner.nextDouble();
			songs.get(updateSong - 1).setId(songName, singerName, moveName, duration);

			System.out.println("Update done......");

		}

	}
}
