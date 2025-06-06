package com.fclongoo.querytolerence;

import java.text.DecimalFormat;
import java.util.Locale;

public class GB1800 {
	public final static String symbols[] = { "a", "b", "c", "cd", "d", "e",
			"ef", "f", "fg", "g", "k", "m", "n", "p", "r", "s", "t", "u", "v",
			"x", "y", "z", "za", "zb", "zc", "h", "j", "js" };
	private final static int MAXINT = Integer.MAX_VALUE;
	private final static double tolerences[][] = {
			{ 3, 0.8, 1.2, 2, 3, 4, 6, 10, 14, 25, 40, 60, 100, 140, 250, 400,
					600, 1000, 1400 },
			{ 6, 1, 1.5, 2.5, 4, 5, 8, 12, 18, 30, 48, 75, 120, 180, 300, 480,
					750, 1200, 1800 },
			{ 10, 1, 1.5, 2.5, 4, 6, 9, 15, 22, 36, 58, 90, 150, 220, 360, 580,
					900, 1500, 2200 },
			{ 18, 1.2, 2, 3, 5, 8, 11, 18, 27, 43, 70, 110, 180, 270, 430, 700,
					1100, 1800, 2700 },
			{ 30, 1.5, 2.5, 4, 6, 9, 13, 21, 33, 52, 84, 130, 210, 330, 520,
					840, 1300, 2100, 3300 },
			{ 50, 1.5, 2.5, 4, 7, 11, 16, 25, 39, 62, 100, 160, 250, 390, 620,
					1000, 1600, 2500, 3900 },
			{ 80, 2, 3, 5, 8, 13, 19, 30, 46, 74, 120, 190, 300, 460, 740,
					1200, 1900, 3000, 4600 },
			{ 120, 2.5, 4, 6, 10, 15, 22, 35, 54, 87, 140, 220, 350, 540, 870,
					1400, 2200, 3500, 5400 },
			{ 180, 3.5, 5, 8, 12, 18, 25, 40, 63, 100, 160, 250, 400, 630,
					1000, 1600, 2500, 4000, 6300 },
			{ 250, 4.5, 7, 10, 14, 20, 29, 46, 72, 115, 185, 290, 460, 720,
					1150, 1850, 2900, 4600, 7200 },
			{ 315, 6, 8, 12, 16, 23, 32, 52, 81, 130, 210, 320, 520, 810, 1300,
					2100, 3200, 5200, 8100 },
			{ 400, 7, 9, 13, 18, 25, 36, 57, 89, 140, 230, 360, 570, 890, 1400,
					2300, 3600, 5700, 8900 },
			{ 500, 8, 10, 15, 20, 27, 40, 63, 97, 155, 250, 400, 630, 970,
					1550, 2500, 4000, 6300, 9700 },
			{ 630, 9, 11, 16, 22, 32, 44, 70, 110, 175, 280, 440, 700, 1100,
					1750, 2800, 4400, 7000, 11000 },
			{ 800, 10, 13, 18, 25, 36, 50, 80, 125, 200, 320, 500, 800, 1250,
					2000, 3200, 5000, 8000, 12500 },
			{ 1000, 11, 15, 21, 28, 40, 56, 90, 140, 230, 360, 560, 900, 1400,
					2300, 3600, 5600, 9000, 14000 },
			{ 1250, 13, 18, 24, 33, 47, 66, 105, 165, 260, 420, 660, 1050,
					1650, 2600, 4200, 6600, 10500, 16500 },
			{ 1600, 15, 21, 29, 39, 55, 78, 125, 195, 210, 500, 780, 1250,
					1950, 3100, 5000, 7800, 12500, 19500 },
			{ 2000, 18, 25, 35, 46, 65, 92, 150, 230, 370, 600, 920, 1500,
					2300, 3700, 6000, 9200, 15000, 23000 },
			{ 2500, 22, 30, 41, 55, 78, 110, 175, 280, 440, 700, 1100, 1750,
					2800, 4400, 7000, 11000, 17500, 28000 },
			{ 3150, 26, 36, 50, 68, 96, 135, 210, 330, 540, 860, 1350, 2100,
					3300, 5400, 8600, 13500, 21000, 33000 } };
	private final static double deviations[][] = {
			{ 3, -270, -140, -60, -34, -20, -14, -10, -6, -4, -2, 0, 2, 4, 6,
					10, 14, MAXINT, 18, MAXINT, 20, MAXINT, 26, 32, 40, 60, -2,
					-4, -6, 2, 4, 6, 0, 0, 0, 0, 0, 0 },
			{ 6, -270, -140, -70, -46, -30, -20, -14, -10, -6, -4, 1, 4, 8, 12,
					15, 19, MAXINT, 23, MAXINT, 28, MAXINT, 35, 42, 50, 80, -2,
					-4, MAXINT, 5, 6, 10, 1, 1.5, 1, 3, 4, 6 },
			{ 10, -280, -150, -80, -56, -40, -25, -18, -13, -8, -5, 1, 6, 10,
					15, 19, 23, MAXINT, 28, MAXINT, 34, MAXINT, 42, 52, 67, 97,
					-2, -5, MAXINT, 6, 8, 12, 1, 1.5, 2, 3, 6, 7 },
			{ 14, -290, -150, -95, MAXINT, -50, -32, MAXINT, -16, MAXINT, -6,
					1, 7, 12, 18, 23, 28, MAXINT, 33, MAXINT, 40, MAXINT, 50,
					64, 90, 130, -3, -6, MAXINT, 6, 10, 15, 1, 2, 3, 3, 7, 9 },
			{ 18, -290, -150, -95, MAXINT, -50, -32, MAXINT, -16, MAXINT, -6,
					1, 7, 12, 18, 23, 28, MAXINT, 33, 39, 45, MAXINT, 60, 77,
					108, 150, -3, -6, MAXINT, 6, 10, 15, 1, 2, 3, 3, 7, 9 },
			{ 24, -300, -160, -110, MAXINT, -65, -40, MAXINT, -20, MAXINT, -7,
					2, 8, 15, 22, 28, 35, MAXINT, 41, 47, 54, 63, 73, 98, 136,
					188, -4, -8, MAXINT, 8, 12, 20, 1.5, 2, 3, 4, 8, 12 },
			{ 30, -300, -160, -110, MAXINT, -65, -40, MAXINT, -20, MAXINT, -7,
					2, 8, 15, 22, 28, 35, 41, 48, 55, 64, 75, 88, 118, 160,
					218, -4, -8, MAXINT, 8, 12, 20, 1.5, 2, 3, 4, 8, 12 },
			{ 40, -310, -170, -120, MAXINT, -80, -50, MAXINT, -25, MAXINT, -9,
					2, 9, 17, 26, 34, 43, 48, 60, 68, 80, 94, 112, 148, 200,
					274, -5, -10, MAXINT, 10, 14, 24, 1.5, 3, 4, 5, 9, 14 },
			{ 50, -320, -180, -130, MAXINT, -80, -50, MAXINT, -25, MAXINT, -9,
					2, 9, 17, 26, 34, 43, 54, 70, 81, 97, 114, 136, 180, 242,
					325, -5, -10, MAXINT, 10, 14, 24, 1.5, 3, 4, 5, 9, 14 },
			{ 65, -340, -190, -140, MAXINT, -100, -60, MAXINT, -30, MAXINT,
					-10, 2, 11, 20, 32, 41, 53, 66, 87, 102, 122, 144, 172,
					226, 300, 405, -7, -12, MAXINT, 13, 18, 28, 2, 3, 5, 6, 11,
					16 },
			{ 80, -360, -200, -150, MAXINT, -100, -60, MAXINT, -30, MAXINT,
					-10, 2, 11, 20, 32, 43, 59, 75, 102, 120, 146, 174, 210,
					274, 360, 480, -7, -12, MAXINT, 13, 18, 28, 2, 3, 5, 6, 11,
					16 },
			{ 100, -380, -220, -170, MAXINT, -120, -72, MAXINT, -36, MAXINT,
					-12, 3, 13, 23, 37, 51, 71, 91, 124, 146, 178, 214, 258,
					335, 445, 585, -9, -15, MAXINT, 16, 22, 34, 2, 4, 5, 7, 13,
					19 },
			{ 120, -410, -240, -180, MAXINT, -120, -72, MAXINT, -36, MAXINT,
					-12, 3, 13, 23, 37, 54, 79, 104, 144, 172, 210, 254, 310,
					400, 525, 690, -9, -15, MAXINT, 16, 22, 34, 2, 4, 5, 7, 13,
					19 },
			{ 140, -460, -260, -200, MAXINT, -145, -85, MAXINT, -43, MAXINT,
					-14, 3, 15, 27, 43, 63, 92, 122, 170, 202, 248, 300, 365,
					470, 620, 800, -11, -18, MAXINT, 18, 26, 41, 3, 4, 6, 7,
					16, 23 },
			{ 160, -520, -280, -210, MAXINT, -145, -85, MAXINT, -43, MAXINT,
					-14, 3, 15, 27, 43, 65, 100, 134, 190, 228, 280, 340, 415,
					535, 700, 900, -11, -18, MAXINT, 18, 26, 41, 3, 4, 6, 7,
					16, 23 },
			{ 180, -580, -310, -230, MAXINT, -145, -85, MAXINT, -43, MAXINT,
					-14, 3, 15, 27, 43, 68, 108, 146, 210, 252, 310, 380, 465,
					600, 780, 1000, -11, -18, MAXINT, 18, 26, 41, 3, 4, 6, 7,
					16, 23 },
			{ 200, -660, -340, -240, MAXINT, -170, -100, MAXINT, -50, MAXINT,
					-15, 4, 17, 31, 50, 77, 122, 166, 236, 284, 350, 425, 520,
					670, 880, 1150, -13, -21, MAXINT, 22, 30, 47, 3, 4, 6, 9,
					17, 26 },
			{ 225, -740, -380, -260, MAXINT, -170, -100, MAXINT, -50, MAXINT,
					-15, 4, 17, 31, 50, 80, 130, 180, 258, 310, 385, 470, 575,
					740, 960, 1250, -13, -21, MAXINT, 22, 30, 47, 3, 4, 6, 9,
					17, 26 },
			{ 250, -820, -420, -280, MAXINT, -170, -100, MAXINT, -50, MAXINT,
					-15, 4, 17, 31, 50, 84, 140, 196, 284, 340, 425, 520, 640,
					820, 1050, 1350, -13, -21, MAXINT, 22, 30, 47, 3, 4, 6, 9,
					17, 26 },
			{ 280, -920, -480, -300, MAXINT, -190, -110, MAXINT, -56, MAXINT,
					-17, 4, 20, 34, 56, 94, 158, 218, 315, 385, 475, 580, 710,
					920, 1200, 1550, -16, -26, MAXINT, 25, 36, 55, 4, 4, 7, 9,
					20, 29 },
			{ 315, -1050, -540, -330, MAXINT, -190, -110, MAXINT, -56, MAXINT,
					-17, 4, 20, 34, 56, 98, 170, 240, 350, 425, 525, 650, 790,
					1000, 1300, 1700, -16, -26, MAXINT, 25, 36, 55, 4, 4, 7, 9,
					20, 29 },
			{ 355, -1200, -600, -360, MAXINT, -210, -125, MAXINT, -62, MAXINT,
					-18, 4, 21, 37, 62, 108, 190, 268, 390, 475, 590, 730, 900,
					1150, 1500, 1900, -18, -28, MAXINT, 29, 39, 60, 4, 5, 7,
					11, 21, 32 },
			{ 400, -1350, -680, -400, MAXINT, -210, -125, MAXINT, -62, MAXINT,
					-18, 4, 21, 37, 62, 114, 208, 294, 435, 530, 660, 820,
					1000, 1300, 1650, 2100, -18, -28, MAXINT, 29, 39, 60, 4, 5,
					7, 11, 21, 32 },
			{ 450, -1500, -760, -440, MAXINT, -230, -135, MAXINT, -68, MAXINT,
					-20, 5, 23, 40, 68, 126, 232, 330, 490, 595, 740, 920,
					1100, 1450, 1850, 2400, -20, -32, MAXINT, 33, 43, 66, 5, 5,
					7, 13, 23, 34 },
			{ 500, -1650, -840, -480, MAXINT, -230, -135, MAXINT, -68, MAXINT,
					-20, 5, 23, 40, 68, 132, 252, 360, 540, 660, 820, 1000,
					1250, 1600, 2100, 2600, -20, -32, MAXINT, 33, 43, 66, 5, 5,
					7, 13, 23, 34 },
			{ 560, MAXINT, MAXINT, MAXINT, MAXINT, -260, -145, MAXINT, -76,
					MAXINT, -22, 0, 26, 44, 78, 150, 280, 400, 600, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT },
			{ 630, MAXINT, MAXINT, MAXINT, MAXINT, -260, -145, MAXINT, -76,
					MAXINT, -22, 0, 26, 44, 78, 155, 310, 450, 660, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT },
			{ 710, MAXINT, MAXINT, MAXINT, MAXINT, -290, -160, MAXINT, -80,
					MAXINT, -24, 0, 30, 50, 88, 175, 340, 500, 740, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT },
			{ 800, MAXINT, MAXINT, MAXINT, MAXINT, -290, -160, MAXINT, -80,
					MAXINT, -24, 0, 30, 50, 88, 185, 380, 560, 840, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT },
			{ 900, MAXINT, MAXINT, MAXINT, MAXINT, -320, -170, MAXINT, -86,
					MAXINT, -26, 0, 34, 56, 100, 210, 430, 620, 940, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT },
			{ 1000, MAXINT, MAXINT, MAXINT, MAXINT, -320, -170, MAXINT, -86,
					MAXINT, -26, 0, 34, 56, 100, 220, 470, 680, 1050, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT },
			{ 1120, MAXINT, MAXINT, MAXINT, MAXINT, -350, -195, MAXINT, -98,
					MAXINT, -28, 0, 40, 66, 120, 250, 520, 780, 1150, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT },
			{ 1250, MAXINT, MAXINT, MAXINT, MAXINT, -350, -195, MAXINT, -98,
					MAXINT, -28, 0, 40, 66, 120, 260, 580, 840, 1300, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT },
			{ 1400, MAXINT, MAXINT, MAXINT, MAXINT, -390, -220, MAXINT, -110,
					MAXINT, -30, 0, 48, 78, 140, 300, 640, 960, 1450, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT },
			{ 1600, MAXINT, MAXINT, MAXINT, MAXINT, -390, -220, MAXINT, -110,
					MAXINT, -30, 0, 48, 78, 140, 330, 720, 1050, 1600, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT },
			{ 1800, MAXINT, MAXINT, MAXINT, MAXINT, -430, -240, MAXINT, -120,
					MAXINT, -32, 0, 58, 92, 170, 370, 820, 1200, 1850, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT },
			{ 2000, MAXINT, MAXINT, MAXINT, MAXINT, -430, -240, MAXINT, -120,
					MAXINT, -32, 0, 58, 92, 170, 400, 920, 1350, 2000, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT },
			{ 2240, MAXINT, MAXINT, MAXINT, MAXINT, -480, -260, MAXINT, -130,
					MAXINT, -34, 0, 68, 110, 195, 440, 1000, 1500, 2300,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT },
			{ 2500, MAXINT, MAXINT, MAXINT, MAXINT, -480, -260, MAXINT, -130,
					MAXINT, -34, 0, 68, 110, 195, 460, 1100, 1650, 2500,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT },
			{ 2800, MAXINT, MAXINT, MAXINT, MAXINT, -520, -290, MAXINT, -145,
					MAXINT, -38, 0, 76, 135, 240, 550, 1250, 1900, 2900,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT },
			{ 3150, MAXINT, MAXINT, MAXINT, MAXINT, -520, -290, MAXINT, -145,
					MAXINT, -38, 0, 76, 135, 240, 580, 1400, 2100, 3200,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT, MAXINT,
					MAXINT, MAXINT, MAXINT, MAXINT, MAXINT } };

	private static double normalsize = 6.0;
	private static String symbol = "M";
	private static int level = 6;

	private static double es = 0.0;
	private static double ei = 0.0;

	private static int GetSymbolIndex(String Sym) {

		for (int i = 0; i < symbols.length; i++) {
			if (Sym.equals(symbols[i])) {
				return i;
			} else if (Sym.toLowerCase(Locale.US).equals(symbols[i])) {
				return i + 65536;
			}
		}
		return -1;
	}

	private static boolean GetTolerences() {
		double it = MAXINT;

		if (level <= 0 || level > 18)
			return false;
		if (normalsize <= 1 && level >= 14)
			return false;
		double d;
		double p = 0;
		int i;
		for (i = 0; i < tolerences.length; i++) {
			if (normalsize > p && normalsize <= tolerences[i][0]) {
				it = tolerences[i][level];
				break;
			}
			p = tolerences[i][0];
		}
		if (it == MAXINT)
			return false;
		int N = GetSymbolIndex(symbol);
		if (N == -1)
			return false;
		p = 0.0;
		int m = -1;
		for (i = 0; i < deviations.length; i++) {
			if (normalsize > p && normalsize <= deviations[i][0]) {
				m = i;
				break;
			}
			p = deviations[i][0];
		}
		if (m == -1)
			return false;
		double ee = MAXINT;
		int n;
		if (N >= 65536) {
			n = N - 65536;
		} else {
			n = N;
		}
		if (n >= 0 && n <= 9) {

			ee = deviations[m][n + 1];
			if (ee == MAXINT)
				return false;
			if (normalsize <= 1 && (n == 0 && n == 1))
				return false;
			if (N < 65536) {
				es = ee;
				ei = es - it;
			} else {
				ei = -ee;
				es = ei + it;
			}
		} else if (n >= 10 && n <= 24) {
			ee = deviations[m][n + 1];
			if (ee == MAXINT)
				return false;
			if (N < 65536) {
				if (n == 10 && !(level >= 4 && level <= 7)) {
					ei = 0;
				} else {
					ei = ee;
				}
				es = ei + it;
			} else {
				ee = -ee;
				if (n == 10) {

					if (level > 8 && m > 0)
						return false;
					if (level <= 8 && m > 0 && m < 25) {
						if (level == 3) {
							d = deviations[m][32];
						} else if (level == 4) {
							d = deviations[m][33];
						} else if (level == 5) {
							d = deviations[m][34];
						} else if (level == 6) {
							d = deviations[m][35];
						} else if (level == 7) {
							d = deviations[m][36];
						} else if (level == 8) {
							d = deviations[m][37];
						} else {
							return false;
						}
						if (d == MAXINT)
							return false;
						ee = ee + d;
					}
				} else if (n == 11) {

					if (level <= 8 && m > 0 && m < 25) {
						if ((m == 19 || m == 20) && (level == 6)) {
							ee = -9;
						} else {
							if (level == 3) {
								d = deviations[m][32];
							} else if (level == 4) {
								d = deviations[m][33];
							} else if (level == 5) {
								d = deviations[m][34];
							} else if (level == 6) {
								d = deviations[m][35];
							} else if (level == 7) {
								d = deviations[m][36];
							} else if (level == 8) {
								d = deviations[m][37];
							} else {
								return false;
							}
							if (d == MAXINT)
								return false;
							ee = ee + d;
						}
					}
				} else if (n == 12) {

					if ((normalsize <= 1) && (level > 8))
						return false;
					if ((level > 8) && (m > 0) && (m < 25))
						ee = 0;
					if ((level <= 8) && (m > 0) && (m < 25)) {
						if (level == 3) {
							d = deviations[m][32];
						} else if (level == 4) {
							d = deviations[m][33];
						} else if (level == 5) {
							d = deviations[m][34];
						} else if (level == 6) {
							d = deviations[m][35];
						} else if (level == 7) {
							d = deviations[m][36];
						} else if (level == 8) {
							d = deviations[m][37];
						} else {
							return false;
						}
						if (d == MAXINT)
							return false;
						ee = ee + d;
					}
				} else if (n >= 13 && n <= 24) {
					if (level <= 7) {
						if (level == 3) {
							d = deviations[m][32];
						} else if (level == 4) {
							d = deviations[m][33];
						} else if (level == 5) {
							d = deviations[m][34];
						} else if (level == 6) {
							d = deviations[m][35];
						} else if (level == 7) {
							d = deviations[m][36];
						} else {
							return false;
						}
						if (d == MAXINT)
							return false;
						ee = ee + d;
					}
				}
				es = ee;
				ei = es - it;
			}
		}
		if (n == 25) {
			if (N < 65536) {
				es = 0;
				ei = -(it);
			} else {
				ei = 0;
				es = it;
			}
		}
		if (n == 26) {
			if (N < 65536) {
				if (level == 5 || level == 6) {
					ee = deviations[m][26];
				} else if (level == 7) {
					ee = deviations[m][27];
				} else if (level == 8) {
					ee = deviations[m][28];
				} else {
					return false;
				}
				if (ee == MAXINT)
					return false;
				ei = ee;
				es = ei + it;
			} else {
				if (level == 6) {
					ee = deviations[m][29];
				} else if (level == 7) {
					ee = deviations[m][30];
				} else if (level == 8) {
					ee = deviations[m][31];
				} else {
					return false;
				}
				if (ee == MAXINT)
					return false;
				es = ee;
				ei = es - it;
			}
		}
		if (n == 27) {
			if (level >= 7 && level <= 11 && (Math.round(it) - it) == 0
					&& it % 2 == 1)
				it--;
			es = it / 2;
			ei = -es;
		}
		return true;
	}

	public static String Query(double ns, String sm, int lv) {
		normalsize = ns;
		symbol = sm;
		level = lv;

		int x = GetSymbolIndex(symbol);
		System.out.println(Integer.toString(x));
		String s;
		if (GetTolerences()) {
			DecimalFormat df = new DecimalFormat("#0.000#");
			es /= 1000.0;
			ei /= 1000.0;
			if (symbol.toLowerCase(Locale.US).equals("js")) {
				s = "±" + df.format(es);
			} else {
				String se;
				String si;
				if (es > 0) {
					se = "+" + df.format(es);
				} else if (es == 0) {
					se = " 0";
				} else {
					se = df.format(es);
				}

				if (ei > 0) {
					si = "+" + df.format(ei);
				} else if (ei == 0) {
					si = " 0";
				} else {
					si = df.format(ei);
				}
				s = se + "\n" + si;
			}
		} else {
			s = "";
		}
		return s;
	}
}
