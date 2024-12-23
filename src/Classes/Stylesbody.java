package Classes;

import java.util.ArrayList;
import java.util.List;

public class Stylesbody {
    List<String> P_app=new ArrayList<String>();
    List<String>P_list=new ArrayList<String>();
    List<String>P_card=new ArrayList<String>();
    List<String>P_card_h=new ArrayList<String>();
    List<String>P_card_i=new ArrayList<String>();
    List<String>P_detail=new ArrayList<String>();
    List<String>P_detail_i=new ArrayList<String>();

    public List<String> getP_app() {
        return P_app;
    }

    public void setP_app(List<String> p_app) {
        P_app = p_app;
    }

    public List<String> getP_list() {
        return P_list;
    }

    public void setP_list(List<String> p_list) {
        P_list = p_list;
    }

    public List<String> getP_card() {
        return P_card;
    }

    public void setP_card(List<String> p_card) {
        P_card = p_card;
    }

    public List<String> getP_card_h() {
        return P_card_h;
    }

    public void setP_card_h(List<String> p_card_h) {
        P_card_h = p_card_h;
    }

    public List<String> getP_card_i() {
        return P_card_i;
    }

    public void setP_card_i(List<String> p_card_i) {
        P_card_i = p_card_i;
    }

    public List<String> getP_detail() {
        return P_detail;
    }

    public void setP_detail(List<String> p_detail) {
        P_detail = p_detail;
    }

    public List<String> getP_detail_i() {
        return P_detail_i;
    }

    public void setP_detail_i(List<String> p_detail_i) {
        P_detail_i = p_detail_i;
    }

    @Override
    public String toString() {
        if (P_app != null){
            return '\n' +"P_app='" + P_app + '\n' + '}';
        }
        if (P_list != null){
            return '\n' +"P_list='" + P_list + '\n' + '}';
        }
        if (P_card != null){
            return '\n' +"P_card='" + P_card + '\n' + '}';
        }
        if (P_card_h != null){
            return '\n' +"P_card_h='" + P_card_h + '\n' + '}';
        }
        if (P_card_i != null){
            return '\n' +"P_card_i='" + P_card_i + '\n' + '}';
        }
        if (P_detail != null){
            return '\n' +"P_detail='" + P_detail + '\n' + '}';
        }
            return '\n' +"P_detail_i='" + P_detail_i + '\n' + '}';
    }
}
