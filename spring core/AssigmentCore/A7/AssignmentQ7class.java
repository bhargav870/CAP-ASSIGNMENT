package org.Bhargav.AssigmentCore.A7;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AssignmentQ7class {
	@Value("#{55/5}")
    private Integer S;
    @Value("#{8+8}")
    private Integer X;
    @Value("#{9+7}")
    private Integer Y;

    public Integer getS() {
        return S;
    }

    public void setS(Integer s) {
        S = s;
    }


    
     @Autowired
    private Assignment1Q7point point;

    @Override
	public String toString() {
		return "AssignmentQ7class [S=" + S + ", X=" + X + ", Y=" + Y + ", point=" + point + "]";
	}

    public Assignment1Q7point getPoint() {
		return point;
	}

	public void setPoint(Assignment1Q7point point) {
		this.point = point;
	}

	public Integer getX() {
        return X;
    }

    public void setX(Integer x) {
        X = x;
    }

    public Integer getY() {
        return Y;
    }

    public void setY(Integer y) {
        Y = y;
    }
  
}