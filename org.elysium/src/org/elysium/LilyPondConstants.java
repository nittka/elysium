package org.elysium;

public class LilyPondConstants {

	private LilyPondConstants() {
	}

	/**
	 * The official extension of LilyPond files.
	 */
	public static final String EXTENSION = "ly"; //$NON-NLS-1$

	/**
	 * The official extension of included (not standalone) LilyPond files.
	 */
	public static final String INCLUDED_EXTENSION = "ily"; //$NON-NLS-1$

	/**
	 * The official extensions of LilyPond files.
	 */
	public static final String[] EXTENSIONS = { EXTENSION, INCLUDED_EXTENSION };

	/**
	 * LilyPond counts column numbers based on this tab width value.
	 */
	public static final int TAB_WIDTH = 8;

}