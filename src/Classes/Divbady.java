package Classes;

import java.util.ArrayList;
import java.util.List;

public class Divbady{
   // Div div;
    List<Div>div=new ArrayList<Div>();
    List<String>HEADER=new ArrayList<String>();
    List<String>SECTION=new ArrayList<String>();
    List<String>ARTICLE=new ArrayList<String>();
    List<String>ASIDE=new ArrayList<String>();
    List<String>DETAILS=new ArrayList<String>();
    List<String>A=new ArrayList<String>();
    List<String>OL=new ArrayList<String>();
    List<String>UL=new ArrayList<String>();
    List<String>LI=new ArrayList<String>();
    List<String>NAV=new ArrayList<String>();
    List<String>H1=new ArrayList<String>();
    List<String>H2=new ArrayList<String>();
    List<String>H3=new ArrayList<String>();
    List<String>H4=new ArrayList<String>();
    List<String>H5=new ArrayList<String>();
    List<String>H6=new ArrayList<String>();
    List<String>P=new ArrayList<String>();
    List<String>IMG=new ArrayList<String>();
    List<String>SPAN=new ArrayList<String>();
    List<String>STRONG=new ArrayList<String>();
    List<String>I=new ArrayList<String>();
    List<String>U=new ArrayList<String>();
    List<String>B=new ArrayList<String>();
    List<String>SMALL=new ArrayList<String>();
    List<String>MARK=new ArrayList<String>();
    List<String>EM=new ArrayList<String>();

    public List<Div> getDiv() {
        return div;
    }

    public void setDiv(List<Div> div) {
        this.div = div;
    }

    public List<String> getHEADER() {
        return HEADER;
    }

    public void setHEADER(List<String> HEADER) {
        this.HEADER = HEADER;
    }

    public List<String> getSECTION() {
        return SECTION;
    }

    public void setSECTION(List<String> SECTION) {
        this.SECTION = SECTION;
    }

    public List<String> getARTICLE() {
        return ARTICLE;
    }

    public void setARTICLE(List<String> ARTICLE) {
        this.ARTICLE = ARTICLE;
    }

    public List<String> getASIDE() {
        return ASIDE;
    }

    public void setASIDE(List<String> ASIDE) {
        this.ASIDE = ASIDE;
    }

    public List<String> getDETAILS() {
        return DETAILS;
    }

    public void setDETAILS(List<String> DETAILS) {
        this.DETAILS = DETAILS;
    }

    public List<String> getA() {
        return A;
    }

    public void setA(List<String> a) {
        A = a;
    }

    public List<String> getOL() {
        return OL;
    }

    public void setOL(List<String> OL) {
        this.OL = OL;
    }

    public List<String> getUL() {
        return UL;
    }

    public void setUL(List<String> UL) {
        this.UL = UL;
    }

    public List<String> getLI() {
        return LI;
    }

    public void setLI(List<String> LI) {
        this.LI = LI;
    }

    public List<String> getNAV() {
        return NAV;
    }

    public void setNAV(List<String> NAV) {
        this.NAV = NAV;
    }

    public List<String> getH1() {
        return H1;
    }

    public void setH1(List<String> h1) {
        H1 = h1;
    }

    public List<String> getH2() {
        return H2;
    }

    public void setH2(List<String> h2) {
        H2 = h2;
    }

    public List<String> getH3() {
        return H3;
    }

    public void setH3(List<String> h3) {
        H3 = h3;
    }

    public List<String> getH4() {
        return H4;
    }

    public void setH4(List<String> h4) {
        H4 = h4;
    }

    public List<String> getH5() {
        return H5;
    }

    public void setH5(List<String> h5) {
        H5 = h5;
    }

    public List<String> getH6() {
        return H6;
    }

    public void setH6(List<String> h6) {
        H6 = h6;
    }

    public List<String> getP() {
        return P;
    }

    public void setP(List<String> p) {
        P = p;
    }

    public List<String> getIMG() {
        return IMG;
    }

    public void setIMG(List<String> IMG) {
        this.IMG = IMG;
    }

    public List<String> getSPAN() {
        return SPAN;
    }

    public void setSPAN(List<String> SPAN) {
        this.SPAN = SPAN;
    }

    public List<String> getSTRONG() {
        return STRONG;
    }

    public void setSTRONG(List<String> STRONG) {
        this.STRONG = STRONG;
    }

    public List<String> getI() {
        return I;
    }

    public void setI(List<String> i) {
        I = i;
    }

    public List<String> getU() {
        return U;
    }

    public void setU(List<String> u) {
        U = u;
    }

    public List<String> getB() {
        return B;
    }

    public void setB(List<String> b) {
        B = b;
    }

    public List<String> getSMALL() {
        return SMALL;
    }

    public void setSMALL(List<String> SMALL) {
        this.SMALL = SMALL;
    }

    public List<String> getMARK() {
        return MARK;
    }

    public void setMARK(List<String> MARK) {
        this.MARK = MARK;
    }

    public List<String> getEM() {
        return EM;
    }

    public void setEM(List<String> EM) {
        this.EM = EM;
    }

    @Override
    public String toString() {
        if (div != null) {
            return '\n' + "div=" + div + '\n';
        } else if (HEADER != null) {
            return '\n' + "HEADER=" + HEADER + '\n';
        } else if (SECTION != null) {
            return '\n' + "SECTION=" + SECTION + '\n';
        } else if (ARTICLE != null) {
            return '\n' + "ARTICLE=" + ARTICLE + '\n';
        } else if (ASIDE != null) {
            return '\n' + "ASIDE=" + ASIDE + '\n';
        } else if (DETAILS != null) {
            return '\n' + "DETAILS=" + DETAILS + '\n';
        } else if (A != null) {
            return '\n' + "A=" + A + '\n';
        } else if (OL != null) {
            return '\n' + "OL=" + OL + '\n';
        } else if (UL != null) {
            return '\n' + "UL=" + UL + '\n';
        } else if (LI != null) {
            return '\n' + "LI=" + LI + '\n';
        } else if (NAV != null) {
            return '\n' + "NAV=" + NAV + '\n';
        } else if (H1 != null) {
            return '\n' + "H1=" + H1 + '\n';
        } else if (H2 != null) {
            return '\n' + "H2=" + H2 + '\n';
        } else if (H3 != null) {
            return '\n' + "H3=" + H3 + '\n';
        } else if (H4 != null) {
            return '\n' + "H4=" + H4 + '\n';
        } else if (H5 != null) {
            return '\n' + "H5=" + H5 + '\n';
        } else if (H6 != null) {
            return '\n' + "H6=" + H6 + '\n';
        } else if (P != null) {
            return '\n' + "P=" + P + '\n';
        } else if (IMG != null) {
            return '\n' + "IMG=" + IMG + '\n';
        } else if (SPAN != null) {
            return '\n' + "SPAN=" + SPAN + '\n';
        } else if (I != null) {
            return '\n' + "I=" + I + '\n';
        } else if (U != null) {
            return '\n' + "U=" + U + '\n';
        } else if (B != null) {
            return '\n' + "B=" + B + '\n';
        } else if (SMALL != null) {
            return '\n' + "SMALL=" + SMALL + '\n';
        } else if (MARK != null) {
            return '\n' + "MARK=" + MARK + '\n';
        }
        return
                " EM=" + EM + '\n' ;
    }
}

