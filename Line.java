public class Line {
	// A line composes of two points (as instance variables)
	private Point begin;    // beginning point
	private Point end;      // ending point

	// Constructors
	public Line (Point begin, Point end) {  // caller to construct the Points
		this.begin = begin;
		this.end = end;
	}
	public Line (int beginX, int beginY, int endX, int endY) {
		begin = new Point(beginX, beginY);   // construct the Points here
		end = new Point(endX, endY);
	}

	// Public methods
	public String toString() {
		return "Line: (" + begin + ", " + end + ")";
	}

	public Point getBegin() { 
		return begin;
	}
	public Point getEnd() { 
		return end;
	}
	public void setBegin(Point newbegin) {
		begin = newbegin;
	}
	public void setEnd(Point newend) { 
		end = newend;
	}

	public int getBeginX() { 
		return begin.getX();
	}
	public int getBeginY() { 
		return begin.getY();
	}
	public int getEndX() { 
		return end.getX();
	}
	public int getEndY() { 
		return end.getY();
	}

	public void setBeginX(int newx) { 
		begin.setX(newx);
	}
	public void setBeginY(int newy) { 
		begin.setY(newy);
	}
	public void setBeginXY(int newx, int newy) { 
		begin.setXY(newx, newy);
	}
	public void setEndX(int newx) { 
		end.setX(newx);
	}
	public void setEndY(int newy) { 
		end.setY(newy);
	}
	public void setEndXY(int newx, int newy) { 
		end.setXY(newx, newy);
	}

	public double getLength() { 
		int xDiff = getEndX() - getBeginX();
		int yDiff = getEndY() - getBeginY();
		return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	} // Length of the line
	// Math.sqrt(xDiff*xDiff + yDiff*yDiff)
	public double getGradient() { 
		int xDiff = getEndX() - getBeginX();
		int yDiff = getEndY() - getBeginY();
		return Math.atan2(yDiff, xDiff);
	} // Gradient in radians
	// Math.atan2(yDiff, xDiff)
}