public class LineSub extends Point {
	// A line needs two points: begin and end.
	// The begin point is inherited from its superclass Point.
	// Private variables
	Point begin;
	Point end;   // Ending point

	// Constructors
	public LineSub (int beginX, int beginY, int endX, int endY) {
		super(beginX, beginY);             // construct the begin Point
		this.end = new Point(endX, endY);// construct the end Point
		this.begin = new Point(beginX, beginY);
	}
	public LineSub (Point begin, Point end) {  // caller to construct the Points
		super(begin.getX(), begin.getY());      // need to reconstruct the begin Point
		this.end = end;
		this.begin = begin;
	}

	// Public methods
	// Inherits methods getX() and getY() from superclass Point
	public String toString() { 
		return "Line: (" + begin + ", " + end + ")";
	}

	public Point getBegin() {
		return begin;
	}
	public Point getEnd() { 
		return end;
	}
	public void setBegin(Point newBegin) { 
		begin = newBegin;
	}
	public void setEnd(Point newEnd) { 
		end = newEnd;
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

	public void setBeginX(int newX) { 
		begin.setX(newX);
	}
	public void setBeginY(int newY) { 
		begin.setY(newY);
	}
	public void setBeginXY(int newX, int newY) { 
		begin.setXY(newX, newY);
	}
	public void setEndX(int newX) { 
		end.setX(newX);
	}
	public void setEndY(int newY) { 
		end.setY(newY);
	}
	public void setEndXY(int newX, int newY) { 
		end.setXY(newX, newY);
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
	}
}