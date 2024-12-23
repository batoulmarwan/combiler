package Ast;
import Classes.*;
import gen.AngularParser;
import gen.AngularParserBaseVisitor;
public class BaseVisitor extends AngularParserBaseVisitor {

    @Override
    public App visitApp(AngularParser.AppContext ctx) {
        App app = new App();
        if (ctx.component() != null)
            app.setComponent(visitComponent(ctx.component()));
        if (ctx.appComponent() != null)
            app.setAppComponent(visitAppComponent(ctx.appComponent()));
        return app;
    }

    @Override
    public Component visitComponent(AngularParser.ComponentContext ctx) {
        Component component = new Component();
        if (ctx.Component_OPEN() != null)
            component.setComponent_OPEN(ctx.Component_OPEN().getText());
        if (ctx.component_body() != null)
            component.setComponentbady(visitComponent_body(ctx.component_body()));
        if (ctx.Component_CLOSE() != null)
            component.setComponent_CLOSE(ctx.Component_CLOSE().getText());
        return component;
    }

    @Override
    public Componentbady visitComponent_body(AngularParser.Component_bodyContext ctx) {
        Componentbady componentbady = new Componentbady();
        for (int i = 0; i < ctx.SELECTOR().size(); i++) {
            if (ctx.SELECTOR(i) != null) {
                componentbady.getSELECTOR().add(ctx.SELECTOR(i).getText());
            }
        }
        for (int i = 0; i < ctx.STANDALONE().size(); i++) {
            if (ctx.STANDALONE(i) != null) {
                componentbady.getSTANDALONE().add(ctx.STANDALONE(i).getText());
            }
        }
        for (int i = 0; i < ctx.IMPORT().size(); i++) {
            if (ctx.IMPORT(i) != null) {
                componentbady.getIMPORT().add(ctx.IMPORT(i).getText());
            }
        }
        for (int i = 0; i < ctx.template().size(); i++) {
            if (ctx.template(i) != null) {
                componentbady.getTemplat().add(visitTemplate(ctx.template(i)));
               // componentbady.setTemplat(visitTemplate(ctx.template()));

            }
        }
        for (int i = 0; i < ctx.styles().size(); i++) {
            if (ctx.styles(i) != null) {
                componentbady.getStyle().add(visitStyles(ctx.styles(i)));
               // componentbady.setStyle(visitStyles(ctx.styles().get(i)));
            }
        }
        for (int i = 0; i < ctx.Component_COMMA().size(); i++) {
            if (ctx.Component_COMMA(i) != null) {
                componentbady.getComponent_COMMA().add(ctx.Component_COMMA(i).getText());
            }
        }
        return componentbady;
    }

    @Override
    public Templat visitTemplate(AngularParser.TemplateContext ctx) {
        Templat templat = new Templat();
        if (ctx.TEMPLATE_OPEN() != null)
            templat.setTEMPLATE_OPEN(ctx.TEMPLATE_OPEN().getText());
        if (ctx.template_body() != null)
            templat.setTemplatbady(visitTemplate_body(ctx.template_body()));
        if (ctx.Template_Close() != null)
            templat.setTemplate_Close(ctx.Template_Close().getText());
        return templat;
    }

    @Override
    public Templatbady visitTemplate_body(AngularParser.Template_bodyContext ctx) {
        Templatbady templatbady = new Templatbady();
        if (ctx.OPEN_DIV() != null)
            templatbady.setOPEN_DIV(ctx.OPEN_DIV().getText());
        if (ctx.IN_DIV() != null)
            templatbady.setIN_DIV(ctx.IN_DIV().getText());
        if (ctx.div_body() != null)
            templatbady.setDivbady(visitDiv_body(ctx.div_body()));
        if (ctx.CLOSE_DIV() != null)
            templatbady.setCLOSE_DIV(ctx.CLOSE_DIV().getText());
        return templatbady;
    }

    @Override
    public Div visitDiv(AngularParser.DivContext ctx) {
        Div div = new Div();
        if (ctx.OPEN_NEW_DIV() != null)
            div.setOPEN_NEW_DIV(ctx.OPEN_NEW_DIV().getText());
        if (ctx.IN_DIV() != null)
            div.setIN_DIV(ctx.IN_DIV().getText());
        if (ctx.div_body() != null)
            div.setDiv_body(visitDiv_body(ctx.div_body()));
        if (ctx.CLOSE_DIV() != null)
            div.setCLOSE_DIV(ctx.CLOSE_DIV().getText());
        return div;
    }

    @Override
    public Divbady visitDiv_body(AngularParser.Div_bodyContext ctx) {
        Divbady divbady = new Divbady();
        for (int i = 0; i < ctx.div().size(); i++) {
            if (ctx.div(i) != null) {
               // divbady.setDiv(visitDiv(ctx.div().get(i)));
                divbady.getDiv().add(visitDiv(ctx.div(i)));
            }}
            for (int i = 0; i < ctx.HEADER().size(); i++) {
                if (ctx.HEADER(i) != null) {
                    divbady.getHEADER().add(ctx.HEADER(i).getText());
                }
            }
            for (int i = 0; i < ctx.SECTION().size(); i++) {
                if (ctx.SECTION(i) != null) {
                    divbady.getSECTION().add(ctx.SECTION(i).getText());
                }
            }
            for (int i = 0; i < ctx.ARTICLE().size(); i++) {
                if (ctx.ARTICLE(i) != null) {
                    divbady.getARTICLE().add(ctx.ARTICLE(i).getText());
                }
            }
            for (int i = 0; i < ctx.ASIDE().size(); i++) {
                if (ctx.ASIDE(i) != null) {
                    divbady.getASIDE().add(ctx.ASIDE(i).getText());
                }
            }
            for (int i = 0; i < ctx.DETAILS().size(); i++) {
                if (ctx.DETAILS(i) != null) {
                    divbady.getDETAILS().add(ctx.DETAILS(i).getText());
                }
            }
            for (int i = 0; i < ctx.A().size(); i++) {
                if (ctx.A(i) != null) {
                    divbady.getA().add(ctx.A(i).getText());
                }
            }
            for (int i = 0; i < ctx.OL().size(); i++) {
                if (ctx.OL(i) != null) {
                    divbady.getOL().add(ctx.OL(i).getText());
                }
            }
            for (int i = 0; i < ctx.UL().size(); i++) {
                if (ctx.UL(i) != null) {
                    divbady.getUL().add(ctx.UL(i).getText());
                }
            }
            for (int i = 0; i < ctx.LI().size(); i++) {
                if (ctx.LI(i) != null) {
                    divbady.getLI().add(ctx.LI(i).getText());
                }
            }
            for (int i = 0; i < ctx.NAV().size(); i++) {
                if (ctx.NAV(i) != null) {
                    divbady.getNAV().add(ctx.NAV(i).getText());
                }
            }
            for (int i = 0; i < ctx.H1().size(); i++) {
                if (ctx.H1(i) != null) {
                    divbady.getH1().add(ctx.H1(i).getText());
                }
            }
            for (int i = 0; i < ctx.H2().size(); i++) {
                if (ctx.H2(i) != null) {
                    divbady.getH2().add(ctx.H2(i).getText());
                }
            }
            for (int i = 0; i < ctx.H3().size(); i++) {
                if (ctx.H3(i) != null) {
                    divbady.getH3().add(ctx.H3(i).getText());
                }
            }
            for (int i = 0; i < ctx.H4().size(); i++) {
                if (ctx.H4(i) != null) {
                    divbady.getH4().add(ctx.H4(i).getText());
                }
            }
            for (int i = 0; i < ctx.H5().size(); i++) {
                if (ctx.H5(i) != null) {
                    divbady.getH5().add(ctx.H5(i).getText());
                }
            }
            for (int i = 0; i < ctx.H6().size(); i++) {
                if (ctx.H6(i) != null) {
                    divbady.getH6().add(ctx.H6(i).getText());
                }
            }
            for (int i = 0; i < ctx.P().size(); i++) {
                if (ctx.P(i) != null) {
                    divbady.getP().add(ctx.P(i).getText());
                }
            }
            for (int i = 0; i < ctx.IMG().size(); i++) {
                if (ctx.IMG(i) != null) {
                    divbady.getIMG().add(ctx.IMG(i).getText());
                }
            }
            for (int i = 0; i < ctx.SPAN().size(); i++) {
                if (ctx.SPAN(i) != null) {
                    divbady.getSPAN().add(ctx.SPAN(i).getText());
                }
            }
            for (int i = 0; i < ctx.STRONG().size(); i++) {
                if (ctx.STRONG(i) != null) {
                    divbady.getSTRONG().add(ctx.STRONG(i).getText());
                }
            }
            for (int i = 0; i < ctx.I().size(); i++) {
                if (ctx.I(i) != null) {
                    divbady.getI().add(ctx.I(i).getText());
                }
            }

            for (int i = 0; i < ctx.U().size(); i++) {
                if (ctx.U(i) != null) {
                    divbady.getU().add(ctx.U(i).getText());
                }
            }
            for (int i = 0; i < ctx.B().size(); i++) {
                if (ctx.B(i) != null) {
                    divbady.getB().add(ctx.B(i).getText());
                }
            }
            for (int i = 0; i < ctx.SMALL().size(); i++) {
                if (ctx.SMALL(i) != null) {
                    divbady.getSMALL().add(ctx.SMALL(i).getText());
                }
            }
            for (int i = 0; i < ctx.MARK().size(); i++) {
                if (ctx.MARK(i) != null) {
                    divbady.getMARK().add(ctx.MARK(i).getText());
                }
            }
            for (int i = 0; i < ctx.EM().size(); i++) {
                if (ctx.EM(i) != null) {
                    divbady.getEM().add(ctx.EM(i).getText());
                }
            }
            return divbady;
        }


        @Override
        public Style visitStyles (AngularParser.StylesContext ctx){
            Style style = new Style();
            if (ctx.STYLES_OPEN() != null)
                style.setSTYLES_OPEN(ctx.STYLES_OPEN().getText());
            if (ctx.STYLES_CLOSE()!= null)
                style.setSTYLES_CLOSE(ctx.STYLES_CLOSE().getText());
            if (ctx.styles_body() != null)
                style.setStylebady(visitStyles_body(ctx.styles_body()));
            return style;
        }

    @Override
    public Stylesbody visitStyles_body(AngularParser.Styles_bodyContext ctx) {
        Stylesbody stylesbody = new Stylesbody();
        for (int i = 0; i < ctx.P_app().size(); i++) {
            if (ctx.P_app(i) != null) {
                stylesbody.getP_app().add(ctx.P_app(i).getText());
            }
        }
        for (int i = 0; i < ctx.P_list().size(); i++) {
            if (ctx.P_list(i) != null) {
                stylesbody.getP_list().add(ctx.P_list(i).getText());
            }
        }
        for (int i = 0; i < ctx.P_card().size(); i++) {
            if (ctx.P_card(i) != null) {
                stylesbody.getP_card().add(ctx.P_card(i).getText());
            }
        }
        for (int i = 0; i < ctx.P_card_h().size(); i++) {
            if (ctx.P_card_h(i) != null) {
                stylesbody.getP_card_h().add(ctx.P_card_h(i).getText());
            }
        }
        for (int i = 0; i < ctx.P_card_i().size(); i++) {
            if (ctx.P_card_i(i) != null) {
                stylesbody.getP_card_i().add(ctx.P_card_i(i).getText());
            }
        }
        for (int i = 0; i < ctx.P_detail().size(); i++) {
            if (ctx.P_detail(i) != null) {
                stylesbody.getP_detail().add(ctx.P_detail(i).getText());
            }
        }
        for (int i = 0; i < ctx.P_detail_i().size(); i++) {
            if (ctx.P_detail_i(i) != null) {
                stylesbody.getP_detail_i().add(ctx.P_detail_i(i).getText());
            }
        }

        return stylesbody;
    }

    @Override
        public AppComponent visitAppComponent (AngularParser.AppComponentContext ctx){
            AppComponent appComponent = new AppComponent();
        if (ctx.APPComponent_OPEN()!= null)
            appComponent.setAPPComponent_OPEN(ctx.APPComponent_OPEN().getText());
        if (ctx.appComponent_body() != null)
            appComponent.setAppComponent_body(visitAppComponent_body(ctx.appComponent_body()));
        if (ctx.APPComponent_CLOSE()!= null)
            appComponent.setAPPComponent_CLOSE(ctx.APPComponent_CLOSE().getText());
            return appComponent;
        }

        @Override
        public AppComponent_body visitAppComponent_body (AngularParser.AppComponent_bodyContext ctx){
            AppComponent_body appComponent_body = new AppComponent_body();
            for (int i = 0; i < ctx.products().size(); i++) {
                if (ctx.products(i) != null) {
                   // appComponent_body.setProducts(visitProducts(ctx.products().get(i)));
                    appComponent_body.getProducts().add(visitProducts(ctx.products(i)));

                }}
            for (int i = 0; i < ctx.SelectedProduct().size(); i++) {
                if (ctx.SelectedProduct(i) != null) {
                    appComponent_body.getSelectedProduct().add(ctx.SelectedProduct(i).getText());
                }
            }
            for (int i = 0; i < ctx.click().size(); i++) {
                if (ctx.click(i) != null) {
                 //   appComponent_body.setClick(visitClick(ctx.click().get(i)));
                    appComponent_body.getClick().add(visitClick(ctx.click(i)));
                }}

            return appComponent_body;
        }

        @Override
        public Products visitProducts (AngularParser.ProductsContext ctx){
            Products products = new Products();
            if (ctx.Array_Product_OPEN()!= null)
                products.setArray_Product_OPEN(ctx.Array_Product_OPEN().getText());
            if (ctx.Array_Product_CLOSE()!= null)
                products.setArray_Product_CLOSE(ctx.Array_Product_CLOSE().getText());
            if (ctx.productElement() != null)
                products.setProductElement(visitProductElement(ctx.productElement()));
            return products;
        }

        @Override
        public ProductElement visitProductElement (AngularParser.ProductElementContext ctx){
            ProductElement productElement = new ProductElement();
            for (int i = 0; i < ctx.element_Array().size(); i++) {
                if (ctx.element_Array(i) != null) {
                  //  productElement.setElement_Array(visitElement_Array(ctx.element_Array().get(i)));
                    productElement.getElement_Array().add(visitElement_Array(ctx.element_Array(i)));
                }}
            for (int i = 0; i < ctx.Array_COMMA().size(); i++) {
                if (ctx.Array_COMMA(i) != null) {
                    productElement.getArray_COMMA().add(ctx.Array_COMMA(i).getText());
                }
            }
            return productElement;
        }

    @Override
    public Element_Array visitElement_Array(AngularParser.Element_ArrayContext ctx) {
        Element_Array element_array = new Element_Array();
        if (ctx.Array_element_Open()!= null)
            element_array.setArray_element_Open(ctx.Array_element_Open().getText());
        if (ctx.Element_Array_Close()!= null)
            element_array.setElement_Array_Close(ctx.Element_Array_Close().getText());
        if (ctx.element_body() != null)
            element_array.setElement_body(visitElement_body(ctx.element_body()));
        return element_array;
    }

    @Override
    public Element_body visitElement_body(AngularParser.Element_bodyContext ctx) {
        Element_body element_body = new Element_body();
        for (int i = 0; i < ctx.Element_name().size(); i++) {
            if (ctx.Element_name(i) != null) {
                element_body.getElement_name().add(ctx.Element_name(i).getText());
            }
        }
        for (int i = 0; i < ctx.Array_COMMA().size(); i++) {
            if (ctx.Array_COMMA(i) != null) {
                element_body.getArray_COMMA().add(ctx.Array_COMMA(i).getText());
            }
        }
        return element_body;
    }

    @Override
    public Click visitClick(AngularParser.ClickContext ctx) {
        Click click = new Click();
        if (ctx.OnProductClick()!= null)
            click.setOnProductClick(ctx.OnProductClick().getText());
        if (ctx.ProductClick_Attribute()!= null)
            click.setProductClick_Attribute(ctx.ProductClick_Attribute().getText());
        if (ctx.ProductClick_body()!= null)
            click.setProductClick_body(ctx.ProductClick_body().getText());
        if (ctx.ProductClick_Close()!= null)
            click.setProductClick_Close(ctx.ProductClick_Close().getText());
        return click;
    }
}


