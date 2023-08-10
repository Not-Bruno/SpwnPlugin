package de.bruno.spwn.util;

public class Color {
	// https://minecraft.tools/de/color-code.php
	
    // Reset
    public static final String RESET = "§r";  // Text Reset
    
    // Style
    public static final String BOLD = "$l";			// BOLD
    public static final String ITALIC = "$o";		// ITALIC
    public static final String UNDERLINED = "$n";	// UNDERLINED
    public static final String CROSSED = "$m";		// CROSSED OUT
    public static final String CURSED = "$k";		// CURSED
    
    // Regular Colors
    public static final String BLACK = "§0";   // BLACK
    public static final String RED = "§c";     // RED
    public static final String GREEN = "§a";   // GREEN
    public static final String YELLOW = "§e";  // YELLOW
    public static final String BLUE = "§9";    // BLUE
    public static final String PURPLE = "§d";  // PURPLE
    public static final String CYAN = "§b";    // CYAN
    public static final String WHITE = "§f";   // WHITE
    public static final String ORANGE = "$6";  // ORANGE
    public static final String GRAY = "$7";	   // GRAY
    public static final String RED_DARK = "$4";		// DARK RED
    public static final String GREEN_DARK = "$2";	// DARK GREEN
    public static final String CYAN_DARK = "§3";	// DARK CYAN
    public static final String BLUE_DARK = "$1";	// DARK BLUE
    public static final String PURPLE_DARK = "$5";	// DARK PURPLE
    public static final String GRAY_DARK = "$8";	// DARK GRAY
    
 // Regular Colors + reset Style
    public static final String R_BLACK = "§r§0";   // BLACK
    public static final String R_RED = "§r§c";     // RED
    public static final String R_GREEN = "§r§a";   // GREEN
    public static final String R_YELLOW = "§r§e";  // YELLOW
    public static final String R_BLUE = "§r§9";    // BLUE
    public static final String R_PURPLE = "§r§d";  // PURPLE
    public static final String R_CYAN = "§r§b";    // CYAN
    public static final String R_WHITE = "§r§f";   // WHITE
    public static final String R_ORANGE = "§r$6";  // ORANGE
    public static final String R_GRAY = "§r$7";	   // GRAY
    public static final String R_RED_DARK = "§r$4";		// DARK RED
    public static final String R_GREEN_DARK = "§r$2";	// DARK GREEN
    public static final String R_CYAN_DARK = "§r§3";	// DARK CYAN
    public static final String R_BLUE_DARK = "§r$1";	// DARK BLUE
    public static final String R_PURPLE_DARK = "§r$5";	// DARK PURPLE
    public static final String R_GRAY_DARK = "§r$8";	// DARK GRAY
    
    // Bold
    public static final String BLACK_BOLD = "§0§l";   	// BLACK
    public static final String RED_BOLD = "§c§l";     	// RED
    public static final String GREEN_BOLD = "§a§l";   	// GREEN
    public static final String YELLOW_BOLD = "§e§l";  	// YELLOW
    public static final String BLUE_BOLD = "§9§l";    	// BLUE
    public static final String PURPLE_BOLD = "§d§l";  	// PURPLE
    public static final String CYAN_BOLD = "§b§l";    	// CYAN
    public static final String WHITE_BOLD = "§f§l";   	// WHITE
    public static final String ORANGE_BOLD = "$6§l";  	// ORANGE
    public static final String GRAY_BOLD = "$7§l";		// GRAY
    public static final String RED_DARK_BOLD = "$4§l";		// DARK RED
    public static final String GREEN_DARK_BOLD = "$2§l";	// DARK GREEN
    public static final String CYAN_DARK_BOLD = "§3§l";		// DARK CYAN
    public static final String BLUE_DARK_BOLD = "$1§l";		// DARK BLUE
    public static final String PURPLE_DARK_BOLD = "$5§l";	// DARK PURPLE
    public static final String GRAY_DARK_BOLD = "$8§l";		// DARK GRAY
    
    // Italic
    public static final String BLACK_ITALIC = "§0§o";   	// BLACK
    public static final String RED_ITALIC = "§c§o";     	// RED
    public static final String GREEN_ITALIC = "§a§o";   	// GREEN
    public static final String YELLOW_ITALIC = "§e§o";  	// YELLOW
    public static final String BLUE_ITALIC = "§9§o";    	// BLUE
    public static final String PURPLE_ITALIC = "§d§o";  	// PURPLE
    public static final String CYAN_ITALIC = "§b§o";    	// CYAN
    public static final String WHITE_ITALIC = "§f§o";   	// WHITE
    public static final String ORANGE_ITALIC = "$6§o";  	// ORANGE
    public static final String GRAY_ITALIC = "$7§o";		// GRAY
    public static final String RED_DARK_ITALIC = "$4§o";		// DARK RED
    public static final String GREEN_DARK_ITALIC = "$2§o";		// DARK GREEN
    public static final String CYAN_DARK_ITALIC = "§3§o";		// DARK CYAN
    public static final String BLUE_DARK_ITALIC = "$1§o";		// DARK BLUE
    public static final String PURPLE_DARK_ITALIC = "$5§o";		// DARK PURPLE
    public static final String GRAY_DARK_ITALIC = "$8§o";		// DARK GRAY

    // Underline
    public static final String BLACK_UNDERLINE = "§0§n";   	// BLACK
    public static final String RED_UNDERLINE = "§c§n";     	// RED
    public static final String GREEN_UNDERLINE = "§a§n";   	// GREEN
    public static final String YELLOW_UNDERLINE = "§e§n";  	// YELLOW
    public static final String BLUE_UNDERLINE = "§9§n";    	// BLUE
    public static final String PURPLE_UNDERLINE = "§d§n";  	// PURPLE
    public static final String CYAN_UNDERLINE = "§b§n";    	// CYAN
    public static final String WHITE_UNDERLINE = "§f§n";   	// WHITE
    public static final String ORANGE_UNDERLINE = "$6§n";	// ORANGE
    public static final String GRAY_UNDERLINE = "$7§n";		// GRAY
    public static final String RED_DARK_UNDERLINE = "$4§n";		// DARK RED
    public static final String GREEN_DARK_UNDERLINE = "$2§n";	// DARK GREEN
    public static final String CYAN_DARK_UNDERLINE = "§3§n";	// DARK CYAN
    public static final String BLUE_DARK_UNDERLINE = "$1§n";	// DARK BLUE
    public static final String PURPLE_DARK_UNDERLINE = "$5§n";	// DARK PURPLE
    public static final String GRAY_DARK_UNDERLINE = "$8§n";	// DARK GRAY
    
    // Crossed out
    public static final String BLACK_CROSSED = "§0§m";   	// BLACK
    public static final String RED_CROSSED = "§c§m";     	// RED
    public static final String GREEN_CROSSED = "§a§m";   	// GREEN
    public static final String YELLOW_CROSSED = "§e§m";  	// YELLOW
    public static final String BLUE_CROSSED = "§9§m";    	// BLUE
    public static final String PURPLE_CROSSED = "§d§m";  	// PURPLE
    public static final String CYAN_CROSSED = "§b§m";    	// CYAN
    public static final String WHITE_CROSSED = "§f§m";   	// WHITE
    public static final String ORANGE_CROSSED = "$6§m";		// ORANGE
    public static final String GRAY_CROSSED = "$7§m";		// GRAY
    public static final String RED_DARK_CROSSED = "$4§m";		// DARK RED
    public static final String GREEN_DARK_CROSSED = "$2§m";		// DARK GREEN
    public static final String CYAN_DARK_CROSSED = "§3§m";		// DARK CYAN
    public static final String BLUE_DARK_CROSSED = "$1§m";		// DARK BLUE
    public static final String PURPLE_DARK_CROSSED = "$5§m";	// DARK PURPLE
    public static final String GRAY_DARK_CROSSED = "$8§m";		// DARK GRAY
    
    // Cursed
    public static final String BLACK_CURSED = "§0§k";   	// BLACK
    public static final String RED_CURSED = "§c§k";     	// RED
    public static final String GREEN_CURSED = "§a§k";   	// GREEN
    public static final String YELLOW_CURSED = "§e§k";  	// YELLOW
    public static final String BLUE_CURSED = "§9§k";    	// BLUE
    public static final String PURPLE_CURSED = "§d§k";  	// PURPLE
    public static final String CYAN_CURSED = "§b§k";    	// CYAN
    public static final String WHITE_CURSED = "§f§k";   	// WHITE
    public static final String ORANGE_CURSED = "$6§k";		// ORANGE
    public static final String GRAY_CURSED = "$7§k";		// GRAY
    public static final String RED_DARK_CURSED = "$4§k";		// DARK RED
    public static final String GREEN_DARK_CURSED = "$2§k";		// DARK GREEN
    public static final String CYAN_DARK_CURSED = "§3§k";		// DARK CYAN
    public static final String BLUE_DARK_CURSED = "$1§k";		// DARK BLUE
    public static final String PURPLE_DARK_CURSED = "$5§k";		// DARK PURPLE
    public static final String GRAY_DARK_CURSED = "$8§k";		// DARK GRAY
}
