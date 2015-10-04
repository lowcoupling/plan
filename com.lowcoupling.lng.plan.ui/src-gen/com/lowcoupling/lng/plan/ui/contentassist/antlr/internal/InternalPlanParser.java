package com.lowcoupling.lng.plan.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.lowcoupling.lng.plan.services.PlanGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPlanParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_OPENCURLY", "RULE_CLOSEDCURLY", "RULE_ID", "RULE_ML_COMMENT", "RULE_STRING", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'RESPONSIBLE'", "'ACCOUNTABLE'", "'CONSULTED'", "'INFORMED'", "'Program'", "'name'", "'project'", "'Project'", "'assumptions'", "'constraints'", "'-'", "'Group'", "'dependsOn'", "'plan'", "'.'", "'Resources'", "'Resource'", "'CheckPoint'", "'date'", "'after'", "'offset'", "'completeness'", "'%'", "'at'", "'as'", "'Activity'", "'involves'", "'starts'", "'ends'", "'duration'"
    };
    public static final int RULE_ID=6;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=9;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=8;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int RULE_CLOSEDCURLY=5;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_OPENCURLY=4;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalPlanParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPlanParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPlanParser.tokenNames; }
    public String getGrammarFileName() { return "../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g"; }


     
     	private PlanGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(PlanGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleProgram"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:60:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:61:1: ( ruleProgram EOF )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:62:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram61);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:69:1: ruleProgram : ( ( rule__Program__Alternatives ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:73:2: ( ( ( rule__Program__Alternatives ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:74:1: ( ( rule__Program__Alternatives ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:74:1: ( ( rule__Program__Alternatives ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:75:1: ( rule__Program__Alternatives )
            {
             before(grammarAccess.getProgramAccess().getAlternatives()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:76:1: ( rule__Program__Alternatives )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:76:2: rule__Program__Alternatives
            {
            pushFollow(FOLLOW_rule__Program__Alternatives_in_ruleProgram94);
            rule__Program__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleProject"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:88:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:89:1: ( ruleProject EOF )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:90:1: ruleProject EOF
            {
             before(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_ruleProject_in_entryRuleProject121);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getProjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProject128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:97:1: ruleProject : ( ( rule__Project__Group__0 ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:101:2: ( ( ( rule__Project__Group__0 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:102:1: ( ( rule__Project__Group__0 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:102:1: ( ( rule__Project__Group__0 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:103:1: ( rule__Project__Group__0 )
            {
             before(grammarAccess.getProjectAccess().getGroup()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:104:1: ( rule__Project__Group__0 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:104:2: rule__Project__Group__0
            {
            pushFollow(FOLLOW_rule__Project__Group__0_in_ruleProject154);
            rule__Project__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleAssumption"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:116:1: entryRuleAssumption : ruleAssumption EOF ;
    public final void entryRuleAssumption() throws RecognitionException {
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:117:1: ( ruleAssumption EOF )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:118:1: ruleAssumption EOF
            {
             before(grammarAccess.getAssumptionRule()); 
            pushFollow(FOLLOW_ruleAssumption_in_entryRuleAssumption181);
            ruleAssumption();

            state._fsp--;

             after(grammarAccess.getAssumptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssumption188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssumption"


    // $ANTLR start "ruleAssumption"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:125:1: ruleAssumption : ( ( rule__Assumption__Group__0 ) ) ;
    public final void ruleAssumption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:129:2: ( ( ( rule__Assumption__Group__0 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:130:1: ( ( rule__Assumption__Group__0 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:130:1: ( ( rule__Assumption__Group__0 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:131:1: ( rule__Assumption__Group__0 )
            {
             before(grammarAccess.getAssumptionAccess().getGroup()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:132:1: ( rule__Assumption__Group__0 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:132:2: rule__Assumption__Group__0
            {
            pushFollow(FOLLOW_rule__Assumption__Group__0_in_ruleAssumption214);
            rule__Assumption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssumptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssumption"


    // $ANTLR start "entryRuleConstraint"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:144:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:145:1: ( ruleConstraint EOF )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:146:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint241);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:153:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:157:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:158:1: ( ( rule__Constraint__Group__0 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:158:1: ( ( rule__Constraint__Group__0 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:159:1: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:160:1: ( rule__Constraint__Group__0 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:160:2: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0_in_ruleConstraint274);
            rule__Constraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleActivityGroup"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:172:1: entryRuleActivityGroup : ruleActivityGroup EOF ;
    public final void entryRuleActivityGroup() throws RecognitionException {
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:173:1: ( ruleActivityGroup EOF )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:174:1: ruleActivityGroup EOF
            {
             before(grammarAccess.getActivityGroupRule()); 
            pushFollow(FOLLOW_ruleActivityGroup_in_entryRuleActivityGroup301);
            ruleActivityGroup();

            state._fsp--;

             after(grammarAccess.getActivityGroupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityGroup308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActivityGroup"


    // $ANTLR start "ruleActivityGroup"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:181:1: ruleActivityGroup : ( ( rule__ActivityGroup__Group__0 ) ) ;
    public final void ruleActivityGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:185:2: ( ( ( rule__ActivityGroup__Group__0 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:186:1: ( ( rule__ActivityGroup__Group__0 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:186:1: ( ( rule__ActivityGroup__Group__0 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:187:1: ( rule__ActivityGroup__Group__0 )
            {
             before(grammarAccess.getActivityGroupAccess().getGroup()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:188:1: ( rule__ActivityGroup__Group__0 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:188:2: rule__ActivityGroup__Group__0
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group__0_in_ruleActivityGroup334);
            rule__ActivityGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivityGroup"


    // $ANTLR start "entryRulePlanImport"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:204:1: entryRulePlanImport : rulePlanImport EOF ;
    public final void entryRulePlanImport() throws RecognitionException {
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:205:1: ( rulePlanImport EOF )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:206:1: rulePlanImport EOF
            {
             before(grammarAccess.getPlanImportRule()); 
            pushFollow(FOLLOW_rulePlanImport_in_entryRulePlanImport365);
            rulePlanImport();

            state._fsp--;

             after(grammarAccess.getPlanImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlanImport372); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlanImport"


    // $ANTLR start "rulePlanImport"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:213:1: rulePlanImport : ( ( rule__PlanImport__Group__0 ) ) ;
    public final void rulePlanImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:217:2: ( ( ( rule__PlanImport__Group__0 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:218:1: ( ( rule__PlanImport__Group__0 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:218:1: ( ( rule__PlanImport__Group__0 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:219:1: ( rule__PlanImport__Group__0 )
            {
             before(grammarAccess.getPlanImportAccess().getGroup()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:220:1: ( rule__PlanImport__Group__0 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:220:2: rule__PlanImport__Group__0
            {
            pushFollow(FOLLOW_rule__PlanImport__Group__0_in_rulePlanImport398);
            rule__PlanImport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlanImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlanImport"


    // $ANTLR start "entryRuleQualifiedName"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:232:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:233:1: ( ruleQualifiedName EOF )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:234:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName425);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName432); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:241:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:245:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:246:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:246:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:247:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:248:1: ( rule__QualifiedName__Group__0 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:248:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName458);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleActivityElement"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:262:1: entryRuleActivityElement : ruleActivityElement EOF ;
    public final void entryRuleActivityElement() throws RecognitionException {
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:263:1: ( ruleActivityElement EOF )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:264:1: ruleActivityElement EOF
            {
             before(grammarAccess.getActivityElementRule()); 
            pushFollow(FOLLOW_ruleActivityElement_in_entryRuleActivityElement487);
            ruleActivityElement();

            state._fsp--;

             after(grammarAccess.getActivityElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityElement494); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActivityElement"


    // $ANTLR start "ruleActivityElement"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:271:1: ruleActivityElement : ( ( rule__ActivityElement__Alternatives ) ) ;
    public final void ruleActivityElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:275:2: ( ( ( rule__ActivityElement__Alternatives ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:276:1: ( ( rule__ActivityElement__Alternatives ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:276:1: ( ( rule__ActivityElement__Alternatives ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:277:1: ( rule__ActivityElement__Alternatives )
            {
             before(grammarAccess.getActivityElementAccess().getAlternatives()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:278:1: ( rule__ActivityElement__Alternatives )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:278:2: rule__ActivityElement__Alternatives
            {
            pushFollow(FOLLOW_rule__ActivityElement__Alternatives_in_ruleActivityElement520);
            rule__ActivityElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActivityElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivityElement"


    // $ANTLR start "entryRuleENDLINE"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:290:1: entryRuleENDLINE : ruleENDLINE EOF ;
    public final void entryRuleENDLINE() throws RecognitionException {
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:291:1: ( ruleENDLINE EOF )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:292:1: ruleENDLINE EOF
            {
             before(grammarAccess.getENDLINERule()); 
            pushFollow(FOLLOW_ruleENDLINE_in_entryRuleENDLINE547);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getENDLINERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleENDLINE554); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleENDLINE"


    // $ANTLR start "ruleENDLINE"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:299:1: ruleENDLINE : ( ';' ) ;
    public final void ruleENDLINE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:303:2: ( ( ';' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:304:1: ( ';' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:304:1: ( ';' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:305:1: ';'
            {
             before(grammarAccess.getENDLINEAccess().getSemicolonKeyword()); 
            match(input,13,FOLLOW_13_in_ruleENDLINE581); 
             after(grammarAccess.getENDLINEAccess().getSemicolonKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleENDLINE"


    // $ANTLR start "entryRuleResources"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:320:1: entryRuleResources : ruleResources EOF ;
    public final void entryRuleResources() throws RecognitionException {
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:321:1: ( ruleResources EOF )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:322:1: ruleResources EOF
            {
             before(grammarAccess.getResourcesRule()); 
            pushFollow(FOLLOW_ruleResources_in_entryRuleResources609);
            ruleResources();

            state._fsp--;

             after(grammarAccess.getResourcesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResources616); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResources"


    // $ANTLR start "ruleResources"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:329:1: ruleResources : ( ( rule__Resources__Group__0 ) ) ;
    public final void ruleResources() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:333:2: ( ( ( rule__Resources__Group__0 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:334:1: ( ( rule__Resources__Group__0 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:334:1: ( ( rule__Resources__Group__0 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:335:1: ( rule__Resources__Group__0 )
            {
             before(grammarAccess.getResourcesAccess().getGroup()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:336:1: ( rule__Resources__Group__0 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:336:2: rule__Resources__Group__0
            {
            pushFollow(FOLLOW_rule__Resources__Group__0_in_ruleResources642);
            rule__Resources__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourcesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResources"


    // $ANTLR start "entryRuleResource"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:348:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:349:1: ( ruleResource EOF )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:350:1: ruleResource EOF
            {
             before(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource669);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getResourceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource676); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:357:1: ruleResource : ( ( rule__Resource__Group__0 ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:361:2: ( ( ( rule__Resource__Group__0 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:362:1: ( ( rule__Resource__Group__0 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:362:1: ( ( rule__Resource__Group__0 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:363:1: ( rule__Resource__Group__0 )
            {
             before(grammarAccess.getResourceAccess().getGroup()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:364:1: ( rule__Resource__Group__0 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:364:2: rule__Resource__Group__0
            {
            pushFollow(FOLLOW_rule__Resource__Group__0_in_ruleResource702);
            rule__Resource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleCheckPoint"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:376:1: entryRuleCheckPoint : ruleCheckPoint EOF ;
    public final void entryRuleCheckPoint() throws RecognitionException {
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:377:1: ( ruleCheckPoint EOF )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:378:1: ruleCheckPoint EOF
            {
             before(grammarAccess.getCheckPointRule()); 
            pushFollow(FOLLOW_ruleCheckPoint_in_entryRuleCheckPoint729);
            ruleCheckPoint();

            state._fsp--;

             after(grammarAccess.getCheckPointRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckPoint736); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCheckPoint"


    // $ANTLR start "ruleCheckPoint"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:385:1: ruleCheckPoint : ( ( rule__CheckPoint__Group__0 ) ) ;
    public final void ruleCheckPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:389:2: ( ( ( rule__CheckPoint__Group__0 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:390:1: ( ( rule__CheckPoint__Group__0 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:390:1: ( ( rule__CheckPoint__Group__0 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:391:1: ( rule__CheckPoint__Group__0 )
            {
             before(grammarAccess.getCheckPointAccess().getGroup()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:392:1: ( rule__CheckPoint__Group__0 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:392:2: rule__CheckPoint__Group__0
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group__0_in_ruleCheckPoint762);
            rule__CheckPoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckPointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheckPoint"


    // $ANTLR start "entryRuleResourceInvolvement"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:404:1: entryRuleResourceInvolvement : ruleResourceInvolvement EOF ;
    public final void entryRuleResourceInvolvement() throws RecognitionException {
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:405:1: ( ruleResourceInvolvement EOF )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:406:1: ruleResourceInvolvement EOF
            {
             before(grammarAccess.getResourceInvolvementRule()); 
            pushFollow(FOLLOW_ruleResourceInvolvement_in_entryRuleResourceInvolvement789);
            ruleResourceInvolvement();

            state._fsp--;

             after(grammarAccess.getResourceInvolvementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceInvolvement796); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResourceInvolvement"


    // $ANTLR start "ruleResourceInvolvement"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:413:1: ruleResourceInvolvement : ( ( rule__ResourceInvolvement__Group__0 ) ) ;
    public final void ruleResourceInvolvement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:417:2: ( ( ( rule__ResourceInvolvement__Group__0 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:418:1: ( ( rule__ResourceInvolvement__Group__0 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:418:1: ( ( rule__ResourceInvolvement__Group__0 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:419:1: ( rule__ResourceInvolvement__Group__0 )
            {
             before(grammarAccess.getResourceInvolvementAccess().getGroup()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:420:1: ( rule__ResourceInvolvement__Group__0 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:420:2: rule__ResourceInvolvement__Group__0
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group__0_in_ruleResourceInvolvement822);
            rule__ResourceInvolvement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceInvolvementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResourceInvolvement"


    // $ANTLR start "entryRuleActivity"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:432:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:433:1: ( ruleActivity EOF )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:434:1: ruleActivity EOF
            {
             before(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity849);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity856); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:441:1: ruleActivity : ( ( rule__Activity__Group__0 ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:445:2: ( ( ( rule__Activity__Group__0 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:446:1: ( ( rule__Activity__Group__0 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:446:1: ( ( rule__Activity__Group__0 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:447:1: ( rule__Activity__Group__0 )
            {
             before(grammarAccess.getActivityAccess().getGroup()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:448:1: ( rule__Activity__Group__0 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:448:2: rule__Activity__Group__0
            {
            pushFollow(FOLLOW_rule__Activity__Group__0_in_ruleActivity882);
            rule__Activity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivity"


    // $ANTLR start "ruleResponsibility"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:463:1: ruleResponsibility : ( ( rule__Responsibility__Alternatives ) ) ;
    public final void ruleResponsibility() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:467:1: ( ( ( rule__Responsibility__Alternatives ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:468:1: ( ( rule__Responsibility__Alternatives ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:468:1: ( ( rule__Responsibility__Alternatives ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:469:1: ( rule__Responsibility__Alternatives )
            {
             before(grammarAccess.getResponsibilityAccess().getAlternatives()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:470:1: ( rule__Responsibility__Alternatives )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:470:2: rule__Responsibility__Alternatives
            {
            pushFollow(FOLLOW_rule__Responsibility__Alternatives_in_ruleResponsibility921);
            rule__Responsibility__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getResponsibilityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResponsibility"


    // $ANTLR start "rule__Program__Alternatives"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:481:1: rule__Program__Alternatives : ( ( ( rule__Program__Group_0__0 ) ) | ( ( rule__Program__ProjectsAssignment_1 ) ) );
    public final void rule__Program__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:485:1: ( ( ( rule__Program__Group_0__0 ) ) | ( ( rule__Program__ProjectsAssignment_1 ) ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case RULE_ML_COMMENT:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==18) ) {
                    alt1=1;
                }
                else if ( (LA1_1==21) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                alt1=1;
                }
                break;
            case 21:
                {
                alt1=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:486:1: ( ( rule__Program__Group_0__0 ) )
                    {
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:486:1: ( ( rule__Program__Group_0__0 ) )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:487:1: ( rule__Program__Group_0__0 )
                    {
                     before(grammarAccess.getProgramAccess().getGroup_0()); 
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:488:1: ( rule__Program__Group_0__0 )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:488:2: rule__Program__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Program__Group_0__0_in_rule__Program__Alternatives956);
                    rule__Program__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProgramAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:492:6: ( ( rule__Program__ProjectsAssignment_1 ) )
                    {
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:492:6: ( ( rule__Program__ProjectsAssignment_1 ) )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:493:1: ( rule__Program__ProjectsAssignment_1 )
                    {
                     before(grammarAccess.getProgramAccess().getProjectsAssignment_1()); 
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:494:1: ( rule__Program__ProjectsAssignment_1 )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:494:2: rule__Program__ProjectsAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Program__ProjectsAssignment_1_in_rule__Program__Alternatives974);
                    rule__Program__ProjectsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getProgramAccess().getProjectsAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Alternatives"


    // $ANTLR start "rule__ActivityElement__Alternatives"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:503:1: rule__ActivityElement__Alternatives : ( ( ruleActivity ) | ( ruleCheckPoint ) | ( ruleActivityGroup ) );
    public final void rule__ActivityElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:507:1: ( ( ruleActivity ) | ( ruleCheckPoint ) | ( ruleActivityGroup ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_ML_COMMENT:
                {
                switch ( input.LA(2) ) {
                case 39:
                    {
                    alt2=1;
                    }
                    break;
                case 25:
                    {
                    alt2=3;
                    }
                    break;
                case 31:
                    {
                    alt2=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

                }
                break;
            case 39:
                {
                alt2=1;
                }
                break;
            case 31:
                {
                alt2=2;
                }
                break;
            case 25:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:508:1: ( ruleActivity )
                    {
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:508:1: ( ruleActivity )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:509:1: ruleActivity
                    {
                     before(grammarAccess.getActivityElementAccess().getActivityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleActivity_in_rule__ActivityElement__Alternatives1007);
                    ruleActivity();

                    state._fsp--;

                     after(grammarAccess.getActivityElementAccess().getActivityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:514:6: ( ruleCheckPoint )
                    {
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:514:6: ( ruleCheckPoint )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:515:1: ruleCheckPoint
                    {
                     before(grammarAccess.getActivityElementAccess().getCheckPointParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCheckPoint_in_rule__ActivityElement__Alternatives1024);
                    ruleCheckPoint();

                    state._fsp--;

                     after(grammarAccess.getActivityElementAccess().getCheckPointParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:520:6: ( ruleActivityGroup )
                    {
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:520:6: ( ruleActivityGroup )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:521:1: ruleActivityGroup
                    {
                     before(grammarAccess.getActivityElementAccess().getActivityGroupParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleActivityGroup_in_rule__ActivityElement__Alternatives1041);
                    ruleActivityGroup();

                    state._fsp--;

                     after(grammarAccess.getActivityElementAccess().getActivityGroupParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityElement__Alternatives"


    // $ANTLR start "rule__CheckPoint__Alternatives_5_0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:531:1: rule__CheckPoint__Alternatives_5_0 : ( ( ( rule__CheckPoint__Group_5_0_0__0 ) ) | ( ( rule__CheckPoint__Group_5_0_1__0 ) ) );
    public final void rule__CheckPoint__Alternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:535:1: ( ( ( rule__CheckPoint__Group_5_0_0__0 ) ) | ( ( rule__CheckPoint__Group_5_0_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==32) ) {
                alt3=1;
            }
            else if ( (LA3_0==33) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:536:1: ( ( rule__CheckPoint__Group_5_0_0__0 ) )
                    {
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:536:1: ( ( rule__CheckPoint__Group_5_0_0__0 ) )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:537:1: ( rule__CheckPoint__Group_5_0_0__0 )
                    {
                     before(grammarAccess.getCheckPointAccess().getGroup_5_0_0()); 
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:538:1: ( rule__CheckPoint__Group_5_0_0__0 )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:538:2: rule__CheckPoint__Group_5_0_0__0
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__Group_5_0_0__0_in_rule__CheckPoint__Alternatives_5_01073);
                    rule__CheckPoint__Group_5_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCheckPointAccess().getGroup_5_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:542:6: ( ( rule__CheckPoint__Group_5_0_1__0 ) )
                    {
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:542:6: ( ( rule__CheckPoint__Group_5_0_1__0 ) )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:543:1: ( rule__CheckPoint__Group_5_0_1__0 )
                    {
                     before(grammarAccess.getCheckPointAccess().getGroup_5_0_1()); 
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:544:1: ( rule__CheckPoint__Group_5_0_1__0 )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:544:2: rule__CheckPoint__Group_5_0_1__0
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__Group_5_0_1__0_in_rule__CheckPoint__Alternatives_5_01091);
                    rule__CheckPoint__Group_5_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCheckPointAccess().getGroup_5_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Alternatives_5_0"


    // $ANTLR start "rule__Activity__Alternatives_6_0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:553:1: rule__Activity__Alternatives_6_0 : ( ( ( rule__Activity__Group_6_0_0__0 ) ) | ( ( rule__Activity__Group_6_0_1__0 ) ) );
    public final void rule__Activity__Alternatives_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:557:1: ( ( ( rule__Activity__Group_6_0_0__0 ) ) | ( ( rule__Activity__Group_6_0_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==41) ) {
                alt4=1;
            }
            else if ( (LA4_0==33) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:558:1: ( ( rule__Activity__Group_6_0_0__0 ) )
                    {
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:558:1: ( ( rule__Activity__Group_6_0_0__0 ) )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:559:1: ( rule__Activity__Group_6_0_0__0 )
                    {
                     before(grammarAccess.getActivityAccess().getGroup_6_0_0()); 
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:560:1: ( rule__Activity__Group_6_0_0__0 )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:560:2: rule__Activity__Group_6_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_6_0_0__0_in_rule__Activity__Alternatives_6_01124);
                    rule__Activity__Group_6_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getGroup_6_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:564:6: ( ( rule__Activity__Group_6_0_1__0 ) )
                    {
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:564:6: ( ( rule__Activity__Group_6_0_1__0 ) )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:565:1: ( rule__Activity__Group_6_0_1__0 )
                    {
                     before(grammarAccess.getActivityAccess().getGroup_6_0_1()); 
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:566:1: ( rule__Activity__Group_6_0_1__0 )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:566:2: rule__Activity__Group_6_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_6_0_1__0_in_rule__Activity__Alternatives_6_01142);
                    rule__Activity__Group_6_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getGroup_6_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Alternatives_6_0"


    // $ANTLR start "rule__Activity__Alternatives_6_1_0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:575:1: rule__Activity__Alternatives_6_1_0 : ( ( ( rule__Activity__Group_6_1_0_0__0 ) ) | ( ( rule__Activity__Group_6_1_0_1__0 ) ) );
    public final void rule__Activity__Alternatives_6_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:579:1: ( ( ( rule__Activity__Group_6_1_0_0__0 ) ) | ( ( rule__Activity__Group_6_1_0_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==42) ) {
                alt5=1;
            }
            else if ( (LA5_0==43) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:580:1: ( ( rule__Activity__Group_6_1_0_0__0 ) )
                    {
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:580:1: ( ( rule__Activity__Group_6_1_0_0__0 ) )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:581:1: ( rule__Activity__Group_6_1_0_0__0 )
                    {
                     before(grammarAccess.getActivityAccess().getGroup_6_1_0_0()); 
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:582:1: ( rule__Activity__Group_6_1_0_0__0 )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:582:2: rule__Activity__Group_6_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_6_1_0_0__0_in_rule__Activity__Alternatives_6_1_01175);
                    rule__Activity__Group_6_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getGroup_6_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:586:6: ( ( rule__Activity__Group_6_1_0_1__0 ) )
                    {
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:586:6: ( ( rule__Activity__Group_6_1_0_1__0 ) )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:587:1: ( rule__Activity__Group_6_1_0_1__0 )
                    {
                     before(grammarAccess.getActivityAccess().getGroup_6_1_0_1()); 
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:588:1: ( rule__Activity__Group_6_1_0_1__0 )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:588:2: rule__Activity__Group_6_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_6_1_0_1__0_in_rule__Activity__Alternatives_6_1_01193);
                    rule__Activity__Group_6_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getGroup_6_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Alternatives_6_1_0"


    // $ANTLR start "rule__Responsibility__Alternatives"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:597:1: rule__Responsibility__Alternatives : ( ( ( 'RESPONSIBLE' ) ) | ( ( 'ACCOUNTABLE' ) ) | ( ( 'CONSULTED' ) ) | ( ( 'INFORMED' ) ) );
    public final void rule__Responsibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:601:1: ( ( ( 'RESPONSIBLE' ) ) | ( ( 'ACCOUNTABLE' ) ) | ( ( 'CONSULTED' ) ) | ( ( 'INFORMED' ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt6=1;
                }
                break;
            case 15:
                {
                alt6=2;
                }
                break;
            case 16:
                {
                alt6=3;
                }
                break;
            case 17:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:602:1: ( ( 'RESPONSIBLE' ) )
                    {
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:602:1: ( ( 'RESPONSIBLE' ) )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:603:1: ( 'RESPONSIBLE' )
                    {
                     before(grammarAccess.getResponsibilityAccess().getRESPONSIBLEEnumLiteralDeclaration_0()); 
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:604:1: ( 'RESPONSIBLE' )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:604:3: 'RESPONSIBLE'
                    {
                    match(input,14,FOLLOW_14_in_rule__Responsibility__Alternatives1227); 

                    }

                     after(grammarAccess.getResponsibilityAccess().getRESPONSIBLEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:609:6: ( ( 'ACCOUNTABLE' ) )
                    {
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:609:6: ( ( 'ACCOUNTABLE' ) )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:610:1: ( 'ACCOUNTABLE' )
                    {
                     before(grammarAccess.getResponsibilityAccess().getACCOUNTABLEEnumLiteralDeclaration_1()); 
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:611:1: ( 'ACCOUNTABLE' )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:611:3: 'ACCOUNTABLE'
                    {
                    match(input,15,FOLLOW_15_in_rule__Responsibility__Alternatives1248); 

                    }

                     after(grammarAccess.getResponsibilityAccess().getACCOUNTABLEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:616:6: ( ( 'CONSULTED' ) )
                    {
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:616:6: ( ( 'CONSULTED' ) )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:617:1: ( 'CONSULTED' )
                    {
                     before(grammarAccess.getResponsibilityAccess().getCONSULTEDEnumLiteralDeclaration_2()); 
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:618:1: ( 'CONSULTED' )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:618:3: 'CONSULTED'
                    {
                    match(input,16,FOLLOW_16_in_rule__Responsibility__Alternatives1269); 

                    }

                     after(grammarAccess.getResponsibilityAccess().getCONSULTEDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:623:6: ( ( 'INFORMED' ) )
                    {
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:623:6: ( ( 'INFORMED' ) )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:624:1: ( 'INFORMED' )
                    {
                     before(grammarAccess.getResponsibilityAccess().getINFORMEDEnumLiteralDeclaration_3()); 
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:625:1: ( 'INFORMED' )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:625:3: 'INFORMED'
                    {
                    match(input,17,FOLLOW_17_in_rule__Responsibility__Alternatives1290); 

                    }

                     after(grammarAccess.getResponsibilityAccess().getINFORMEDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Responsibility__Alternatives"


    // $ANTLR start "rule__Program__Group_0__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:637:1: rule__Program__Group_0__0 : rule__Program__Group_0__0__Impl rule__Program__Group_0__1 ;
    public final void rule__Program__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:641:1: ( rule__Program__Group_0__0__Impl rule__Program__Group_0__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:642:2: rule__Program__Group_0__0__Impl rule__Program__Group_0__1
            {
            pushFollow(FOLLOW_rule__Program__Group_0__0__Impl_in_rule__Program__Group_0__01323);
            rule__Program__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0__1_in_rule__Program__Group_0__01326);
            rule__Program__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0__0"


    // $ANTLR start "rule__Program__Group_0__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:649:1: rule__Program__Group_0__0__Impl : ( ( rule__Program__DescriptionAssignment_0_0 )? ) ;
    public final void rule__Program__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:653:1: ( ( ( rule__Program__DescriptionAssignment_0_0 )? ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:654:1: ( ( rule__Program__DescriptionAssignment_0_0 )? )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:654:1: ( ( rule__Program__DescriptionAssignment_0_0 )? )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:655:1: ( rule__Program__DescriptionAssignment_0_0 )?
            {
             before(grammarAccess.getProgramAccess().getDescriptionAssignment_0_0()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:656:1: ( rule__Program__DescriptionAssignment_0_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ML_COMMENT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:656:2: rule__Program__DescriptionAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Program__DescriptionAssignment_0_0_in_rule__Program__Group_0__0__Impl1353);
                    rule__Program__DescriptionAssignment_0_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProgramAccess().getDescriptionAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0__0__Impl"


    // $ANTLR start "rule__Program__Group_0__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:666:1: rule__Program__Group_0__1 : rule__Program__Group_0__1__Impl ;
    public final void rule__Program__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:670:1: ( rule__Program__Group_0__1__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:671:2: rule__Program__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_0__1__Impl_in_rule__Program__Group_0__11384);
            rule__Program__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0__1"


    // $ANTLR start "rule__Program__Group_0__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:677:1: rule__Program__Group_0__1__Impl : ( ( rule__Program__Group_0_1__0 ) ) ;
    public final void rule__Program__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:681:1: ( ( ( rule__Program__Group_0_1__0 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:682:1: ( ( rule__Program__Group_0_1__0 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:682:1: ( ( rule__Program__Group_0_1__0 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:683:1: ( rule__Program__Group_0_1__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup_0_1()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:684:1: ( rule__Program__Group_0_1__0 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:684:2: rule__Program__Group_0_1__0
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1__0_in_rule__Program__Group_0__1__Impl1411);
            rule__Program__Group_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0__1__Impl"


    // $ANTLR start "rule__Program__Group_0_1__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:698:1: rule__Program__Group_0_1__0 : rule__Program__Group_0_1__0__Impl rule__Program__Group_0_1__1 ;
    public final void rule__Program__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:702:1: ( rule__Program__Group_0_1__0__Impl rule__Program__Group_0_1__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:703:2: rule__Program__Group_0_1__0__Impl rule__Program__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1__0__Impl_in_rule__Program__Group_0_1__01445);
            rule__Program__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1__1_in_rule__Program__Group_0_1__01448);
            rule__Program__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0_1__0"


    // $ANTLR start "rule__Program__Group_0_1__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:710:1: rule__Program__Group_0_1__0__Impl : ( 'Program' ) ;
    public final void rule__Program__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:714:1: ( ( 'Program' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:715:1: ( 'Program' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:715:1: ( 'Program' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:716:1: 'Program'
            {
             before(grammarAccess.getProgramAccess().getProgramKeyword_0_1_0()); 
            match(input,18,FOLLOW_18_in_rule__Program__Group_0_1__0__Impl1476); 
             after(grammarAccess.getProgramAccess().getProgramKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0_1__0__Impl"


    // $ANTLR start "rule__Program__Group_0_1__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:729:1: rule__Program__Group_0_1__1 : rule__Program__Group_0_1__1__Impl rule__Program__Group_0_1__2 ;
    public final void rule__Program__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:733:1: ( rule__Program__Group_0_1__1__Impl rule__Program__Group_0_1__2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:734:2: rule__Program__Group_0_1__1__Impl rule__Program__Group_0_1__2
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1__1__Impl_in_rule__Program__Group_0_1__11507);
            rule__Program__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1__2_in_rule__Program__Group_0_1__11510);
            rule__Program__Group_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0_1__1"


    // $ANTLR start "rule__Program__Group_0_1__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:741:1: rule__Program__Group_0_1__1__Impl : ( ( rule__Program__NameAssignment_0_1_1 ) ) ;
    public final void rule__Program__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:745:1: ( ( ( rule__Program__NameAssignment_0_1_1 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:746:1: ( ( rule__Program__NameAssignment_0_1_1 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:746:1: ( ( rule__Program__NameAssignment_0_1_1 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:747:1: ( rule__Program__NameAssignment_0_1_1 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_0_1_1()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:748:1: ( rule__Program__NameAssignment_0_1_1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:748:2: rule__Program__NameAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__Program__NameAssignment_0_1_1_in_rule__Program__Group_0_1__1__Impl1537);
            rule__Program__NameAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getNameAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0_1__1__Impl"


    // $ANTLR start "rule__Program__Group_0_1__2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:758:1: rule__Program__Group_0_1__2 : rule__Program__Group_0_1__2__Impl rule__Program__Group_0_1__3 ;
    public final void rule__Program__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:762:1: ( rule__Program__Group_0_1__2__Impl rule__Program__Group_0_1__3 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:763:2: rule__Program__Group_0_1__2__Impl rule__Program__Group_0_1__3
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1__2__Impl_in_rule__Program__Group_0_1__21567);
            rule__Program__Group_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1__3_in_rule__Program__Group_0_1__21570);
            rule__Program__Group_0_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0_1__2"


    // $ANTLR start "rule__Program__Group_0_1__2__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:770:1: rule__Program__Group_0_1__2__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__Program__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:774:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:775:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:775:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:776:1: RULE_OPENCURLY
            {
             before(grammarAccess.getProgramAccess().getOPENCURLYTerminalRuleCall_0_1_2()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__Program__Group_0_1__2__Impl1597); 
             after(grammarAccess.getProgramAccess().getOPENCURLYTerminalRuleCall_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0_1__2__Impl"


    // $ANTLR start "rule__Program__Group_0_1__3"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:787:1: rule__Program__Group_0_1__3 : rule__Program__Group_0_1__3__Impl rule__Program__Group_0_1__4 ;
    public final void rule__Program__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:791:1: ( rule__Program__Group_0_1__3__Impl rule__Program__Group_0_1__4 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:792:2: rule__Program__Group_0_1__3__Impl rule__Program__Group_0_1__4
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1__3__Impl_in_rule__Program__Group_0_1__31626);
            rule__Program__Group_0_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1__4_in_rule__Program__Group_0_1__31629);
            rule__Program__Group_0_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0_1__3"


    // $ANTLR start "rule__Program__Group_0_1__3__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:799:1: rule__Program__Group_0_1__3__Impl : ( ( rule__Program__Group_0_1_3__0 )? ) ;
    public final void rule__Program__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:803:1: ( ( ( rule__Program__Group_0_1_3__0 )? ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:804:1: ( ( rule__Program__Group_0_1_3__0 )? )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:804:1: ( ( rule__Program__Group_0_1_3__0 )? )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:805:1: ( rule__Program__Group_0_1_3__0 )?
            {
             before(grammarAccess.getProgramAccess().getGroup_0_1_3()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:806:1: ( rule__Program__Group_0_1_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:806:2: rule__Program__Group_0_1_3__0
                    {
                    pushFollow(FOLLOW_rule__Program__Group_0_1_3__0_in_rule__Program__Group_0_1__3__Impl1656);
                    rule__Program__Group_0_1_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProgramAccess().getGroup_0_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0_1__3__Impl"


    // $ANTLR start "rule__Program__Group_0_1__4"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:816:1: rule__Program__Group_0_1__4 : rule__Program__Group_0_1__4__Impl rule__Program__Group_0_1__5 ;
    public final void rule__Program__Group_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:820:1: ( rule__Program__Group_0_1__4__Impl rule__Program__Group_0_1__5 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:821:2: rule__Program__Group_0_1__4__Impl rule__Program__Group_0_1__5
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1__4__Impl_in_rule__Program__Group_0_1__41687);
            rule__Program__Group_0_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1__5_in_rule__Program__Group_0_1__41690);
            rule__Program__Group_0_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0_1__4"


    // $ANTLR start "rule__Program__Group_0_1__4__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:828:1: rule__Program__Group_0_1__4__Impl : ( ( rule__Program__Group_0_1_4__0 )* ) ;
    public final void rule__Program__Group_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:832:1: ( ( ( rule__Program__Group_0_1_4__0 )* ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:833:1: ( ( rule__Program__Group_0_1_4__0 )* )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:833:1: ( ( rule__Program__Group_0_1_4__0 )* )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:834:1: ( rule__Program__Group_0_1_4__0 )*
            {
             before(grammarAccess.getProgramAccess().getGroup_0_1_4()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:835:1: ( rule__Program__Group_0_1_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:835:2: rule__Program__Group_0_1_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Program__Group_0_1_4__0_in_rule__Program__Group_0_1__4__Impl1717);
            	    rule__Program__Group_0_1_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getGroup_0_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0_1__4__Impl"


    // $ANTLR start "rule__Program__Group_0_1__5"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:845:1: rule__Program__Group_0_1__5 : rule__Program__Group_0_1__5__Impl rule__Program__Group_0_1__6 ;
    public final void rule__Program__Group_0_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:849:1: ( rule__Program__Group_0_1__5__Impl rule__Program__Group_0_1__6 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:850:2: rule__Program__Group_0_1__5__Impl rule__Program__Group_0_1__6
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1__5__Impl_in_rule__Program__Group_0_1__51748);
            rule__Program__Group_0_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1__6_in_rule__Program__Group_0_1__51751);
            rule__Program__Group_0_1__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0_1__5"


    // $ANTLR start "rule__Program__Group_0_1__5__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:857:1: rule__Program__Group_0_1__5__Impl : ( ( rule__Program__Group_0_1_5__0 )* ) ;
    public final void rule__Program__Group_0_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:861:1: ( ( ( rule__Program__Group_0_1_5__0 )* ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:862:1: ( ( rule__Program__Group_0_1_5__0 )* )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:862:1: ( ( rule__Program__Group_0_1_5__0 )* )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:863:1: ( rule__Program__Group_0_1_5__0 )*
            {
             before(grammarAccess.getProgramAccess().getGroup_0_1_5()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:864:1: ( rule__Program__Group_0_1_5__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:864:2: rule__Program__Group_0_1_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Program__Group_0_1_5__0_in_rule__Program__Group_0_1__5__Impl1778);
            	    rule__Program__Group_0_1_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getGroup_0_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0_1__5__Impl"


    // $ANTLR start "rule__Program__Group_0_1__6"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:874:1: rule__Program__Group_0_1__6 : rule__Program__Group_0_1__6__Impl rule__Program__Group_0_1__7 ;
    public final void rule__Program__Group_0_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:878:1: ( rule__Program__Group_0_1__6__Impl rule__Program__Group_0_1__7 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:879:2: rule__Program__Group_0_1__6__Impl rule__Program__Group_0_1__7
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1__6__Impl_in_rule__Program__Group_0_1__61809);
            rule__Program__Group_0_1__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1__7_in_rule__Program__Group_0_1__61812);
            rule__Program__Group_0_1__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0_1__6"


    // $ANTLR start "rule__Program__Group_0_1__6__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:886:1: rule__Program__Group_0_1__6__Impl : ( ( rule__Program__ProjectsAssignment_0_1_6 )* ) ;
    public final void rule__Program__Group_0_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:890:1: ( ( ( rule__Program__ProjectsAssignment_0_1_6 )* ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:891:1: ( ( rule__Program__ProjectsAssignment_0_1_6 )* )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:891:1: ( ( rule__Program__ProjectsAssignment_0_1_6 )* )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:892:1: ( rule__Program__ProjectsAssignment_0_1_6 )*
            {
             before(grammarAccess.getProgramAccess().getProjectsAssignment_0_1_6()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:893:1: ( rule__Program__ProjectsAssignment_0_1_6 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ML_COMMENT||LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:893:2: rule__Program__ProjectsAssignment_0_1_6
            	    {
            	    pushFollow(FOLLOW_rule__Program__ProjectsAssignment_0_1_6_in_rule__Program__Group_0_1__6__Impl1839);
            	    rule__Program__ProjectsAssignment_0_1_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getProjectsAssignment_0_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0_1__6__Impl"


    // $ANTLR start "rule__Program__Group_0_1__7"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:903:1: rule__Program__Group_0_1__7 : rule__Program__Group_0_1__7__Impl ;
    public final void rule__Program__Group_0_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:907:1: ( rule__Program__Group_0_1__7__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:908:2: rule__Program__Group_0_1__7__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1__7__Impl_in_rule__Program__Group_0_1__71870);
            rule__Program__Group_0_1__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0_1__7"


    // $ANTLR start "rule__Program__Group_0_1__7__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:914:1: rule__Program__Group_0_1__7__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__Program__Group_0_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:918:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:919:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:919:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:920:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getProgramAccess().getCLOSEDCURLYTerminalRuleCall_0_1_7()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__Program__Group_0_1__7__Impl1897); 
             after(grammarAccess.getProgramAccess().getCLOSEDCURLYTerminalRuleCall_0_1_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0_1__7__Impl"


    // $ANTLR start "rule__Program__Group_0_1_3__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:947:1: rule__Program__Group_0_1_3__0 : rule__Program__Group_0_1_3__0__Impl rule__Program__Group_0_1_3__1 ;
    public final void rule__Program__Group_0_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:951:1: ( rule__Program__Group_0_1_3__0__Impl rule__Program__Group_0_1_3__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:952:2: rule__Program__Group_0_1_3__0__Impl rule__Program__Group_0_1_3__1
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1_3__0__Impl_in_rule__Program__Group_0_1_3__01942);
            rule__Program__Group_0_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1_3__1_in_rule__Program__Group_0_1_3__01945);
            rule__Program__Group_0_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0_1_3__0"


    // $ANTLR start "rule__Program__Group_0_1_3__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:959:1: rule__Program__Group_0_1_3__0__Impl : ( 'name' ) ;
    public final void rule__Program__Group_0_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:963:1: ( ( 'name' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:964:1: ( 'name' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:964:1: ( 'name' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:965:1: 'name'
            {
             before(grammarAccess.getProgramAccess().getNameKeyword_0_1_3_0()); 
            match(input,19,FOLLOW_19_in_rule__Program__Group_0_1_3__0__Impl1973); 
             after(grammarAccess.getProgramAccess().getNameKeyword_0_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0_1_3__0__Impl"


    // $ANTLR start "rule__Program__Group_0_1_3__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:978:1: rule__Program__Group_0_1_3__1 : rule__Program__Group_0_1_3__1__Impl rule__Program__Group_0_1_3__2 ;
    public final void rule__Program__Group_0_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:982:1: ( rule__Program__Group_0_1_3__1__Impl rule__Program__Group_0_1_3__2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:983:2: rule__Program__Group_0_1_3__1__Impl rule__Program__Group_0_1_3__2
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1_3__1__Impl_in_rule__Program__Group_0_1_3__12004);
            rule__Program__Group_0_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1_3__2_in_rule__Program__Group_0_1_3__12007);
            rule__Program__Group_0_1_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0_1_3__1"


    // $ANTLR start "rule__Program__Group_0_1_3__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:990:1: rule__Program__Group_0_1_3__1__Impl : ( ( rule__Program__LongNameAssignment_0_1_3_1 ) ) ;
    public final void rule__Program__Group_0_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:994:1: ( ( ( rule__Program__LongNameAssignment_0_1_3_1 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:995:1: ( ( rule__Program__LongNameAssignment_0_1_3_1 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:995:1: ( ( rule__Program__LongNameAssignment_0_1_3_1 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:996:1: ( rule__Program__LongNameAssignment_0_1_3_1 )
            {
             before(grammarAccess.getProgramAccess().getLongNameAssignment_0_1_3_1()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:997:1: ( rule__Program__LongNameAssignment_0_1_3_1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:997:2: rule__Program__LongNameAssignment_0_1_3_1
            {
            pushFollow(FOLLOW_rule__Program__LongNameAssignment_0_1_3_1_in_rule__Program__Group_0_1_3__1__Impl2034);
            rule__Program__LongNameAssignment_0_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getLongNameAssignment_0_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0_1_3__1__Impl"


    // $ANTLR start "rule__Program__Group_0_1_3__2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1007:1: rule__Program__Group_0_1_3__2 : rule__Program__Group_0_1_3__2__Impl ;
    public final void rule__Program__Group_0_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1011:1: ( rule__Program__Group_0_1_3__2__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1012:2: rule__Program__Group_0_1_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1_3__2__Impl_in_rule__Program__Group_0_1_3__22064);
            rule__Program__Group_0_1_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0_1_3__2"


    // $ANTLR start "rule__Program__Group_0_1_3__2__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1018:1: rule__Program__Group_0_1_3__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Program__Group_0_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1022:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1023:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1023:1: ( ruleENDLINE )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1024:1: ruleENDLINE
            {
             before(grammarAccess.getProgramAccess().getENDLINEParserRuleCall_0_1_3_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Program__Group_0_1_3__2__Impl2091);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getENDLINEParserRuleCall_0_1_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0_1_3__2__Impl"


    // $ANTLR start "rule__Program__Group_0_1_4__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1041:1: rule__Program__Group_0_1_4__0 : rule__Program__Group_0_1_4__0__Impl rule__Program__Group_0_1_4__1 ;
    public final void rule__Program__Group_0_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1045:1: ( rule__Program__Group_0_1_4__0__Impl rule__Program__Group_0_1_4__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1046:2: rule__Program__Group_0_1_4__0__Impl rule__Program__Group_0_1_4__1
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1_4__0__Impl_in_rule__Program__Group_0_1_4__02126);
            rule__Program__Group_0_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1_4__1_in_rule__Program__Group_0_1_4__02129);
            rule__Program__Group_0_1_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0_1_4__0"


    // $ANTLR start "rule__Program__Group_0_1_4__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1053:1: rule__Program__Group_0_1_4__0__Impl : ( ( rule__Program__PlansAssignment_0_1_4_0 ) ) ;
    public final void rule__Program__Group_0_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1057:1: ( ( ( rule__Program__PlansAssignment_0_1_4_0 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1058:1: ( ( rule__Program__PlansAssignment_0_1_4_0 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1058:1: ( ( rule__Program__PlansAssignment_0_1_4_0 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1059:1: ( rule__Program__PlansAssignment_0_1_4_0 )
            {
             before(grammarAccess.getProgramAccess().getPlansAssignment_0_1_4_0()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1060:1: ( rule__Program__PlansAssignment_0_1_4_0 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1060:2: rule__Program__PlansAssignment_0_1_4_0
            {
            pushFollow(FOLLOW_rule__Program__PlansAssignment_0_1_4_0_in_rule__Program__Group_0_1_4__0__Impl2156);
            rule__Program__PlansAssignment_0_1_4_0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getPlansAssignment_0_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0_1_4__0__Impl"


    // $ANTLR start "rule__Program__Group_0_1_4__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1070:1: rule__Program__Group_0_1_4__1 : rule__Program__Group_0_1_4__1__Impl ;
    public final void rule__Program__Group_0_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1074:1: ( rule__Program__Group_0_1_4__1__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1075:2: rule__Program__Group_0_1_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1_4__1__Impl_in_rule__Program__Group_0_1_4__12186);
            rule__Program__Group_0_1_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0_1_4__1"


    // $ANTLR start "rule__Program__Group_0_1_4__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1081:1: rule__Program__Group_0_1_4__1__Impl : ( ruleENDLINE ) ;
    public final void rule__Program__Group_0_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1085:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1086:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1086:1: ( ruleENDLINE )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1087:1: ruleENDLINE
            {
             before(grammarAccess.getProgramAccess().getENDLINEParserRuleCall_0_1_4_1()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Program__Group_0_1_4__1__Impl2213);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getENDLINEParserRuleCall_0_1_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0_1_4__1__Impl"


    // $ANTLR start "rule__Program__Group_0_1_5__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1102:1: rule__Program__Group_0_1_5__0 : rule__Program__Group_0_1_5__0__Impl rule__Program__Group_0_1_5__1 ;
    public final void rule__Program__Group_0_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1106:1: ( rule__Program__Group_0_1_5__0__Impl rule__Program__Group_0_1_5__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1107:2: rule__Program__Group_0_1_5__0__Impl rule__Program__Group_0_1_5__1
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1_5__0__Impl_in_rule__Program__Group_0_1_5__02246);
            rule__Program__Group_0_1_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1_5__1_in_rule__Program__Group_0_1_5__02249);
            rule__Program__Group_0_1_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0_1_5__0"


    // $ANTLR start "rule__Program__Group_0_1_5__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1114:1: rule__Program__Group_0_1_5__0__Impl : ( 'project' ) ;
    public final void rule__Program__Group_0_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1118:1: ( ( 'project' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1119:1: ( 'project' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1119:1: ( 'project' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1120:1: 'project'
            {
             before(grammarAccess.getProgramAccess().getProjectKeyword_0_1_5_0()); 
            match(input,20,FOLLOW_20_in_rule__Program__Group_0_1_5__0__Impl2277); 
             after(grammarAccess.getProgramAccess().getProjectKeyword_0_1_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0_1_5__0__Impl"


    // $ANTLR start "rule__Program__Group_0_1_5__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1133:1: rule__Program__Group_0_1_5__1 : rule__Program__Group_0_1_5__1__Impl rule__Program__Group_0_1_5__2 ;
    public final void rule__Program__Group_0_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1137:1: ( rule__Program__Group_0_1_5__1__Impl rule__Program__Group_0_1_5__2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1138:2: rule__Program__Group_0_1_5__1__Impl rule__Program__Group_0_1_5__2
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1_5__1__Impl_in_rule__Program__Group_0_1_5__12308);
            rule__Program__Group_0_1_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1_5__2_in_rule__Program__Group_0_1_5__12311);
            rule__Program__Group_0_1_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0_1_5__1"


    // $ANTLR start "rule__Program__Group_0_1_5__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1145:1: rule__Program__Group_0_1_5__1__Impl : ( ( rule__Program__ReferencedProjectsAssignment_0_1_5_1 ) ) ;
    public final void rule__Program__Group_0_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1149:1: ( ( ( rule__Program__ReferencedProjectsAssignment_0_1_5_1 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1150:1: ( ( rule__Program__ReferencedProjectsAssignment_0_1_5_1 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1150:1: ( ( rule__Program__ReferencedProjectsAssignment_0_1_5_1 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1151:1: ( rule__Program__ReferencedProjectsAssignment_0_1_5_1 )
            {
             before(grammarAccess.getProgramAccess().getReferencedProjectsAssignment_0_1_5_1()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1152:1: ( rule__Program__ReferencedProjectsAssignment_0_1_5_1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1152:2: rule__Program__ReferencedProjectsAssignment_0_1_5_1
            {
            pushFollow(FOLLOW_rule__Program__ReferencedProjectsAssignment_0_1_5_1_in_rule__Program__Group_0_1_5__1__Impl2338);
            rule__Program__ReferencedProjectsAssignment_0_1_5_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getReferencedProjectsAssignment_0_1_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0_1_5__1__Impl"


    // $ANTLR start "rule__Program__Group_0_1_5__2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1162:1: rule__Program__Group_0_1_5__2 : rule__Program__Group_0_1_5__2__Impl ;
    public final void rule__Program__Group_0_1_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1166:1: ( rule__Program__Group_0_1_5__2__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1167:2: rule__Program__Group_0_1_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1_5__2__Impl_in_rule__Program__Group_0_1_5__22368);
            rule__Program__Group_0_1_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0_1_5__2"


    // $ANTLR start "rule__Program__Group_0_1_5__2__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1173:1: rule__Program__Group_0_1_5__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Program__Group_0_1_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1177:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1178:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1178:1: ( ruleENDLINE )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1179:1: ruleENDLINE
            {
             before(grammarAccess.getProgramAccess().getENDLINEParserRuleCall_0_1_5_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Program__Group_0_1_5__2__Impl2395);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getENDLINEParserRuleCall_0_1_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0_1_5__2__Impl"


    // $ANTLR start "rule__Project__Group__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1196:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1200:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1201:2: rule__Project__Group__0__Impl rule__Project__Group__1
            {
            pushFollow(FOLLOW_rule__Project__Group__0__Impl_in_rule__Project__Group__02430);
            rule__Project__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__1_in_rule__Project__Group__02433);
            rule__Project__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__0"


    // $ANTLR start "rule__Project__Group__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1208:1: rule__Project__Group__0__Impl : ( ( rule__Project__DescriptionAssignment_0 )? ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1212:1: ( ( ( rule__Project__DescriptionAssignment_0 )? ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1213:1: ( ( rule__Project__DescriptionAssignment_0 )? )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1213:1: ( ( rule__Project__DescriptionAssignment_0 )? )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1214:1: ( rule__Project__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getProjectAccess().getDescriptionAssignment_0()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1215:1: ( rule__Project__DescriptionAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ML_COMMENT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1215:2: rule__Project__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Project__DescriptionAssignment_0_in_rule__Project__Group__0__Impl2460);
                    rule__Project__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getDescriptionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__0__Impl"


    // $ANTLR start "rule__Project__Group__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1225:1: rule__Project__Group__1 : rule__Project__Group__1__Impl rule__Project__Group__2 ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1229:1: ( rule__Project__Group__1__Impl rule__Project__Group__2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1230:2: rule__Project__Group__1__Impl rule__Project__Group__2
            {
            pushFollow(FOLLOW_rule__Project__Group__1__Impl_in_rule__Project__Group__12491);
            rule__Project__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__2_in_rule__Project__Group__12494);
            rule__Project__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__1"


    // $ANTLR start "rule__Project__Group__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1237:1: rule__Project__Group__1__Impl : ( 'Project' ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1241:1: ( ( 'Project' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1242:1: ( 'Project' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1242:1: ( 'Project' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1243:1: 'Project'
            {
             before(grammarAccess.getProjectAccess().getProjectKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__Project__Group__1__Impl2522); 
             after(grammarAccess.getProjectAccess().getProjectKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__1__Impl"


    // $ANTLR start "rule__Project__Group__2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1256:1: rule__Project__Group__2 : rule__Project__Group__2__Impl rule__Project__Group__3 ;
    public final void rule__Project__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1260:1: ( rule__Project__Group__2__Impl rule__Project__Group__3 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1261:2: rule__Project__Group__2__Impl rule__Project__Group__3
            {
            pushFollow(FOLLOW_rule__Project__Group__2__Impl_in_rule__Project__Group__22553);
            rule__Project__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__3_in_rule__Project__Group__22556);
            rule__Project__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__2"


    // $ANTLR start "rule__Project__Group__2__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1268:1: rule__Project__Group__2__Impl : ( ( rule__Project__NameAssignment_2 ) ) ;
    public final void rule__Project__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1272:1: ( ( ( rule__Project__NameAssignment_2 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1273:1: ( ( rule__Project__NameAssignment_2 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1273:1: ( ( rule__Project__NameAssignment_2 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1274:1: ( rule__Project__NameAssignment_2 )
            {
             before(grammarAccess.getProjectAccess().getNameAssignment_2()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1275:1: ( rule__Project__NameAssignment_2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1275:2: rule__Project__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Project__NameAssignment_2_in_rule__Project__Group__2__Impl2583);
            rule__Project__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__2__Impl"


    // $ANTLR start "rule__Project__Group__3"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1285:1: rule__Project__Group__3 : rule__Project__Group__3__Impl rule__Project__Group__4 ;
    public final void rule__Project__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1289:1: ( rule__Project__Group__3__Impl rule__Project__Group__4 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1290:2: rule__Project__Group__3__Impl rule__Project__Group__4
            {
            pushFollow(FOLLOW_rule__Project__Group__3__Impl_in_rule__Project__Group__32613);
            rule__Project__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__4_in_rule__Project__Group__32616);
            rule__Project__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__3"


    // $ANTLR start "rule__Project__Group__3__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1297:1: rule__Project__Group__3__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__Project__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1301:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1302:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1302:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1303:1: RULE_OPENCURLY
            {
             before(grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_3()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__Project__Group__3__Impl2643); 
             after(grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__3__Impl"


    // $ANTLR start "rule__Project__Group__4"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1314:1: rule__Project__Group__4 : rule__Project__Group__4__Impl rule__Project__Group__5 ;
    public final void rule__Project__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1318:1: ( rule__Project__Group__4__Impl rule__Project__Group__5 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1319:2: rule__Project__Group__4__Impl rule__Project__Group__5
            {
            pushFollow(FOLLOW_rule__Project__Group__4__Impl_in_rule__Project__Group__42672);
            rule__Project__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__5_in_rule__Project__Group__42675);
            rule__Project__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__4"


    // $ANTLR start "rule__Project__Group__4__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1326:1: rule__Project__Group__4__Impl : ( ( rule__Project__Group_4__0 )? ) ;
    public final void rule__Project__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1330:1: ( ( ( rule__Project__Group_4__0 )? ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1331:1: ( ( rule__Project__Group_4__0 )? )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1331:1: ( ( rule__Project__Group_4__0 )? )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1332:1: ( rule__Project__Group_4__0 )?
            {
             before(grammarAccess.getProjectAccess().getGroup_4()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1333:1: ( rule__Project__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1333:2: rule__Project__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Project__Group_4__0_in_rule__Project__Group__4__Impl2702);
                    rule__Project__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__4__Impl"


    // $ANTLR start "rule__Project__Group__5"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1343:1: rule__Project__Group__5 : rule__Project__Group__5__Impl rule__Project__Group__6 ;
    public final void rule__Project__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1347:1: ( rule__Project__Group__5__Impl rule__Project__Group__6 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1348:2: rule__Project__Group__5__Impl rule__Project__Group__6
            {
            pushFollow(FOLLOW_rule__Project__Group__5__Impl_in_rule__Project__Group__52733);
            rule__Project__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__6_in_rule__Project__Group__52736);
            rule__Project__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__5"


    // $ANTLR start "rule__Project__Group__5__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1355:1: rule__Project__Group__5__Impl : ( ( rule__Project__ResourcesAssignment_5 )? ) ;
    public final void rule__Project__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1359:1: ( ( ( rule__Project__ResourcesAssignment_5 )? ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1360:1: ( ( rule__Project__ResourcesAssignment_5 )? )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1360:1: ( ( rule__Project__ResourcesAssignment_5 )? )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1361:1: ( rule__Project__ResourcesAssignment_5 )?
            {
             before(grammarAccess.getProjectAccess().getResourcesAssignment_5()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1362:1: ( rule__Project__ResourcesAssignment_5 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1362:2: rule__Project__ResourcesAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Project__ResourcesAssignment_5_in_rule__Project__Group__5__Impl2763);
                    rule__Project__ResourcesAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getResourcesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__5__Impl"


    // $ANTLR start "rule__Project__Group__6"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1372:1: rule__Project__Group__6 : rule__Project__Group__6__Impl rule__Project__Group__7 ;
    public final void rule__Project__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1376:1: ( rule__Project__Group__6__Impl rule__Project__Group__7 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1377:2: rule__Project__Group__6__Impl rule__Project__Group__7
            {
            pushFollow(FOLLOW_rule__Project__Group__6__Impl_in_rule__Project__Group__62794);
            rule__Project__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__7_in_rule__Project__Group__62797);
            rule__Project__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__6"


    // $ANTLR start "rule__Project__Group__6__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1384:1: rule__Project__Group__6__Impl : ( ( rule__Project__Group_6__0 )* ) ;
    public final void rule__Project__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1388:1: ( ( ( rule__Project__Group_6__0 )* ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1389:1: ( ( rule__Project__Group_6__0 )* )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1389:1: ( ( rule__Project__Group_6__0 )* )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1390:1: ( rule__Project__Group_6__0 )*
            {
             before(grammarAccess.getProjectAccess().getGroup_6()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1391:1: ( rule__Project__Group_6__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1391:2: rule__Project__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Project__Group_6__0_in_rule__Project__Group__6__Impl2824);
            	    rule__Project__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__6__Impl"


    // $ANTLR start "rule__Project__Group__7"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1401:1: rule__Project__Group__7 : rule__Project__Group__7__Impl rule__Project__Group__8 ;
    public final void rule__Project__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1405:1: ( rule__Project__Group__7__Impl rule__Project__Group__8 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1406:2: rule__Project__Group__7__Impl rule__Project__Group__8
            {
            pushFollow(FOLLOW_rule__Project__Group__7__Impl_in_rule__Project__Group__72855);
            rule__Project__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__8_in_rule__Project__Group__72858);
            rule__Project__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__7"


    // $ANTLR start "rule__Project__Group__7__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1413:1: rule__Project__Group__7__Impl : ( ( rule__Project__Group_7__0 )? ) ;
    public final void rule__Project__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1417:1: ( ( ( rule__Project__Group_7__0 )? ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1418:1: ( ( rule__Project__Group_7__0 )? )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1418:1: ( ( rule__Project__Group_7__0 )? )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1419:1: ( rule__Project__Group_7__0 )?
            {
             before(grammarAccess.getProjectAccess().getGroup_7()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1420:1: ( rule__Project__Group_7__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1420:2: rule__Project__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Project__Group_7__0_in_rule__Project__Group__7__Impl2885);
                    rule__Project__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__7__Impl"


    // $ANTLR start "rule__Project__Group__8"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1430:1: rule__Project__Group__8 : rule__Project__Group__8__Impl rule__Project__Group__9 ;
    public final void rule__Project__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1434:1: ( rule__Project__Group__8__Impl rule__Project__Group__9 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1435:2: rule__Project__Group__8__Impl rule__Project__Group__9
            {
            pushFollow(FOLLOW_rule__Project__Group__8__Impl_in_rule__Project__Group__82916);
            rule__Project__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__9_in_rule__Project__Group__82919);
            rule__Project__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__8"


    // $ANTLR start "rule__Project__Group__8__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1442:1: rule__Project__Group__8__Impl : ( ( rule__Project__Group_8__0 )? ) ;
    public final void rule__Project__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1446:1: ( ( ( rule__Project__Group_8__0 )? ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1447:1: ( ( rule__Project__Group_8__0 )? )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1447:1: ( ( rule__Project__Group_8__0 )? )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1448:1: ( rule__Project__Group_8__0 )?
            {
             before(grammarAccess.getProjectAccess().getGroup_8()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1449:1: ( rule__Project__Group_8__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1449:2: rule__Project__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Project__Group_8__0_in_rule__Project__Group__8__Impl2946);
                    rule__Project__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__8__Impl"


    // $ANTLR start "rule__Project__Group__9"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1459:1: rule__Project__Group__9 : rule__Project__Group__9__Impl rule__Project__Group__10 ;
    public final void rule__Project__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1463:1: ( rule__Project__Group__9__Impl rule__Project__Group__10 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1464:2: rule__Project__Group__9__Impl rule__Project__Group__10
            {
            pushFollow(FOLLOW_rule__Project__Group__9__Impl_in_rule__Project__Group__92977);
            rule__Project__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__10_in_rule__Project__Group__92980);
            rule__Project__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__9"


    // $ANTLR start "rule__Project__Group__9__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1471:1: rule__Project__Group__9__Impl : ( ( rule__Project__ActivitiesAssignment_9 )* ) ;
    public final void rule__Project__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1475:1: ( ( ( rule__Project__ActivitiesAssignment_9 )* ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1476:1: ( ( rule__Project__ActivitiesAssignment_9 )* )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1476:1: ( ( rule__Project__ActivitiesAssignment_9 )* )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1477:1: ( rule__Project__ActivitiesAssignment_9 )*
            {
             before(grammarAccess.getProjectAccess().getActivitiesAssignment_9()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1478:1: ( rule__Project__ActivitiesAssignment_9 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ML_COMMENT||LA18_0==25||LA18_0==31||LA18_0==39) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1478:2: rule__Project__ActivitiesAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__Project__ActivitiesAssignment_9_in_rule__Project__Group__9__Impl3007);
            	    rule__Project__ActivitiesAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getActivitiesAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__9__Impl"


    // $ANTLR start "rule__Project__Group__10"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1488:1: rule__Project__Group__10 : rule__Project__Group__10__Impl ;
    public final void rule__Project__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1492:1: ( rule__Project__Group__10__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1493:2: rule__Project__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Project__Group__10__Impl_in_rule__Project__Group__103038);
            rule__Project__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__10"


    // $ANTLR start "rule__Project__Group__10__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1499:1: rule__Project__Group__10__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__Project__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1503:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1504:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1504:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1505:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_10()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__Project__Group__10__Impl3065); 
             after(grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__10__Impl"


    // $ANTLR start "rule__Project__Group_4__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1538:1: rule__Project__Group_4__0 : rule__Project__Group_4__0__Impl rule__Project__Group_4__1 ;
    public final void rule__Project__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1542:1: ( rule__Project__Group_4__0__Impl rule__Project__Group_4__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1543:2: rule__Project__Group_4__0__Impl rule__Project__Group_4__1
            {
            pushFollow(FOLLOW_rule__Project__Group_4__0__Impl_in_rule__Project__Group_4__03116);
            rule__Project__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_4__1_in_rule__Project__Group_4__03119);
            rule__Project__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_4__0"


    // $ANTLR start "rule__Project__Group_4__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1550:1: rule__Project__Group_4__0__Impl : ( 'name' ) ;
    public final void rule__Project__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1554:1: ( ( 'name' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1555:1: ( 'name' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1555:1: ( 'name' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1556:1: 'name'
            {
             before(grammarAccess.getProjectAccess().getNameKeyword_4_0()); 
            match(input,19,FOLLOW_19_in_rule__Project__Group_4__0__Impl3147); 
             after(grammarAccess.getProjectAccess().getNameKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_4__0__Impl"


    // $ANTLR start "rule__Project__Group_4__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1569:1: rule__Project__Group_4__1 : rule__Project__Group_4__1__Impl rule__Project__Group_4__2 ;
    public final void rule__Project__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1573:1: ( rule__Project__Group_4__1__Impl rule__Project__Group_4__2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1574:2: rule__Project__Group_4__1__Impl rule__Project__Group_4__2
            {
            pushFollow(FOLLOW_rule__Project__Group_4__1__Impl_in_rule__Project__Group_4__13178);
            rule__Project__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_4__2_in_rule__Project__Group_4__13181);
            rule__Project__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_4__1"


    // $ANTLR start "rule__Project__Group_4__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1581:1: rule__Project__Group_4__1__Impl : ( ( rule__Project__LongNameAssignment_4_1 ) ) ;
    public final void rule__Project__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1585:1: ( ( ( rule__Project__LongNameAssignment_4_1 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1586:1: ( ( rule__Project__LongNameAssignment_4_1 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1586:1: ( ( rule__Project__LongNameAssignment_4_1 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1587:1: ( rule__Project__LongNameAssignment_4_1 )
            {
             before(grammarAccess.getProjectAccess().getLongNameAssignment_4_1()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1588:1: ( rule__Project__LongNameAssignment_4_1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1588:2: rule__Project__LongNameAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Project__LongNameAssignment_4_1_in_rule__Project__Group_4__1__Impl3208);
            rule__Project__LongNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getLongNameAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_4__1__Impl"


    // $ANTLR start "rule__Project__Group_4__2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1598:1: rule__Project__Group_4__2 : rule__Project__Group_4__2__Impl ;
    public final void rule__Project__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1602:1: ( rule__Project__Group_4__2__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1603:2: rule__Project__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Project__Group_4__2__Impl_in_rule__Project__Group_4__23238);
            rule__Project__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_4__2"


    // $ANTLR start "rule__Project__Group_4__2__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1609:1: rule__Project__Group_4__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Project__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1613:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1614:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1614:1: ( ruleENDLINE )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1615:1: ruleENDLINE
            {
             before(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_4_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Project__Group_4__2__Impl3265);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_4__2__Impl"


    // $ANTLR start "rule__Project__Group_6__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1632:1: rule__Project__Group_6__0 : rule__Project__Group_6__0__Impl rule__Project__Group_6__1 ;
    public final void rule__Project__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1636:1: ( rule__Project__Group_6__0__Impl rule__Project__Group_6__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1637:2: rule__Project__Group_6__0__Impl rule__Project__Group_6__1
            {
            pushFollow(FOLLOW_rule__Project__Group_6__0__Impl_in_rule__Project__Group_6__03300);
            rule__Project__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_6__1_in_rule__Project__Group_6__03303);
            rule__Project__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_6__0"


    // $ANTLR start "rule__Project__Group_6__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1644:1: rule__Project__Group_6__0__Impl : ( ( rule__Project__PlansAssignment_6_0 ) ) ;
    public final void rule__Project__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1648:1: ( ( ( rule__Project__PlansAssignment_6_0 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1649:1: ( ( rule__Project__PlansAssignment_6_0 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1649:1: ( ( rule__Project__PlansAssignment_6_0 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1650:1: ( rule__Project__PlansAssignment_6_0 )
            {
             before(grammarAccess.getProjectAccess().getPlansAssignment_6_0()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1651:1: ( rule__Project__PlansAssignment_6_0 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1651:2: rule__Project__PlansAssignment_6_0
            {
            pushFollow(FOLLOW_rule__Project__PlansAssignment_6_0_in_rule__Project__Group_6__0__Impl3330);
            rule__Project__PlansAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getPlansAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_6__0__Impl"


    // $ANTLR start "rule__Project__Group_6__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1661:1: rule__Project__Group_6__1 : rule__Project__Group_6__1__Impl ;
    public final void rule__Project__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1665:1: ( rule__Project__Group_6__1__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1666:2: rule__Project__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Project__Group_6__1__Impl_in_rule__Project__Group_6__13360);
            rule__Project__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_6__1"


    // $ANTLR start "rule__Project__Group_6__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1672:1: rule__Project__Group_6__1__Impl : ( ruleENDLINE ) ;
    public final void rule__Project__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1676:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1677:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1677:1: ( ruleENDLINE )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1678:1: ruleENDLINE
            {
             before(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_6_1()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Project__Group_6__1__Impl3387);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_6__1__Impl"


    // $ANTLR start "rule__Project__Group_7__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1693:1: rule__Project__Group_7__0 : rule__Project__Group_7__0__Impl rule__Project__Group_7__1 ;
    public final void rule__Project__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1697:1: ( rule__Project__Group_7__0__Impl rule__Project__Group_7__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1698:2: rule__Project__Group_7__0__Impl rule__Project__Group_7__1
            {
            pushFollow(FOLLOW_rule__Project__Group_7__0__Impl_in_rule__Project__Group_7__03420);
            rule__Project__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_7__1_in_rule__Project__Group_7__03423);
            rule__Project__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_7__0"


    // $ANTLR start "rule__Project__Group_7__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1705:1: rule__Project__Group_7__0__Impl : ( 'assumptions' ) ;
    public final void rule__Project__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1709:1: ( ( 'assumptions' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1710:1: ( 'assumptions' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1710:1: ( 'assumptions' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1711:1: 'assumptions'
            {
             before(grammarAccess.getProjectAccess().getAssumptionsKeyword_7_0()); 
            match(input,22,FOLLOW_22_in_rule__Project__Group_7__0__Impl3451); 
             after(grammarAccess.getProjectAccess().getAssumptionsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_7__0__Impl"


    // $ANTLR start "rule__Project__Group_7__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1724:1: rule__Project__Group_7__1 : rule__Project__Group_7__1__Impl rule__Project__Group_7__2 ;
    public final void rule__Project__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1728:1: ( rule__Project__Group_7__1__Impl rule__Project__Group_7__2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1729:2: rule__Project__Group_7__1__Impl rule__Project__Group_7__2
            {
            pushFollow(FOLLOW_rule__Project__Group_7__1__Impl_in_rule__Project__Group_7__13482);
            rule__Project__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_7__2_in_rule__Project__Group_7__13485);
            rule__Project__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_7__1"


    // $ANTLR start "rule__Project__Group_7__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1736:1: rule__Project__Group_7__1__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__Project__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1740:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1741:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1741:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1742:1: RULE_OPENCURLY
            {
             before(grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_7_1()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__Project__Group_7__1__Impl3512); 
             after(grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_7__1__Impl"


    // $ANTLR start "rule__Project__Group_7__2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1753:1: rule__Project__Group_7__2 : rule__Project__Group_7__2__Impl rule__Project__Group_7__3 ;
    public final void rule__Project__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1757:1: ( rule__Project__Group_7__2__Impl rule__Project__Group_7__3 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1758:2: rule__Project__Group_7__2__Impl rule__Project__Group_7__3
            {
            pushFollow(FOLLOW_rule__Project__Group_7__2__Impl_in_rule__Project__Group_7__23541);
            rule__Project__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_7__3_in_rule__Project__Group_7__23544);
            rule__Project__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_7__2"


    // $ANTLR start "rule__Project__Group_7__2__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1765:1: rule__Project__Group_7__2__Impl : ( ( rule__Project__AssumptionsAssignment_7_2 )* ) ;
    public final void rule__Project__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1769:1: ( ( ( rule__Project__AssumptionsAssignment_7_2 )* ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1770:1: ( ( rule__Project__AssumptionsAssignment_7_2 )* )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1770:1: ( ( rule__Project__AssumptionsAssignment_7_2 )* )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1771:1: ( rule__Project__AssumptionsAssignment_7_2 )*
            {
             before(grammarAccess.getProjectAccess().getAssumptionsAssignment_7_2()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1772:1: ( rule__Project__AssumptionsAssignment_7_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==24) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1772:2: rule__Project__AssumptionsAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_rule__Project__AssumptionsAssignment_7_2_in_rule__Project__Group_7__2__Impl3571);
            	    rule__Project__AssumptionsAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getAssumptionsAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_7__2__Impl"


    // $ANTLR start "rule__Project__Group_7__3"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1782:1: rule__Project__Group_7__3 : rule__Project__Group_7__3__Impl ;
    public final void rule__Project__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1786:1: ( rule__Project__Group_7__3__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1787:2: rule__Project__Group_7__3__Impl
            {
            pushFollow(FOLLOW_rule__Project__Group_7__3__Impl_in_rule__Project__Group_7__33602);
            rule__Project__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_7__3"


    // $ANTLR start "rule__Project__Group_7__3__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1793:1: rule__Project__Group_7__3__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__Project__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1797:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1798:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1798:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1799:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_7_3()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__Project__Group_7__3__Impl3629); 
             after(grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_7__3__Impl"


    // $ANTLR start "rule__Project__Group_8__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1818:1: rule__Project__Group_8__0 : rule__Project__Group_8__0__Impl rule__Project__Group_8__1 ;
    public final void rule__Project__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1822:1: ( rule__Project__Group_8__0__Impl rule__Project__Group_8__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1823:2: rule__Project__Group_8__0__Impl rule__Project__Group_8__1
            {
            pushFollow(FOLLOW_rule__Project__Group_8__0__Impl_in_rule__Project__Group_8__03666);
            rule__Project__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_8__1_in_rule__Project__Group_8__03669);
            rule__Project__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_8__0"


    // $ANTLR start "rule__Project__Group_8__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1830:1: rule__Project__Group_8__0__Impl : ( 'constraints' ) ;
    public final void rule__Project__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1834:1: ( ( 'constraints' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1835:1: ( 'constraints' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1835:1: ( 'constraints' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1836:1: 'constraints'
            {
             before(grammarAccess.getProjectAccess().getConstraintsKeyword_8_0()); 
            match(input,23,FOLLOW_23_in_rule__Project__Group_8__0__Impl3697); 
             after(grammarAccess.getProjectAccess().getConstraintsKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_8__0__Impl"


    // $ANTLR start "rule__Project__Group_8__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1849:1: rule__Project__Group_8__1 : rule__Project__Group_8__1__Impl rule__Project__Group_8__2 ;
    public final void rule__Project__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1853:1: ( rule__Project__Group_8__1__Impl rule__Project__Group_8__2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1854:2: rule__Project__Group_8__1__Impl rule__Project__Group_8__2
            {
            pushFollow(FOLLOW_rule__Project__Group_8__1__Impl_in_rule__Project__Group_8__13728);
            rule__Project__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_8__2_in_rule__Project__Group_8__13731);
            rule__Project__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_8__1"


    // $ANTLR start "rule__Project__Group_8__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1861:1: rule__Project__Group_8__1__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__Project__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1865:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1866:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1866:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1867:1: RULE_OPENCURLY
            {
             before(grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_8_1()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__Project__Group_8__1__Impl3758); 
             after(grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_8__1__Impl"


    // $ANTLR start "rule__Project__Group_8__2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1878:1: rule__Project__Group_8__2 : rule__Project__Group_8__2__Impl rule__Project__Group_8__3 ;
    public final void rule__Project__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1882:1: ( rule__Project__Group_8__2__Impl rule__Project__Group_8__3 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1883:2: rule__Project__Group_8__2__Impl rule__Project__Group_8__3
            {
            pushFollow(FOLLOW_rule__Project__Group_8__2__Impl_in_rule__Project__Group_8__23787);
            rule__Project__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_8__3_in_rule__Project__Group_8__23790);
            rule__Project__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_8__2"


    // $ANTLR start "rule__Project__Group_8__2__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1890:1: rule__Project__Group_8__2__Impl : ( ( rule__Project__ConstraintsAssignment_8_2 )* ) ;
    public final void rule__Project__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1894:1: ( ( ( rule__Project__ConstraintsAssignment_8_2 )* ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1895:1: ( ( rule__Project__ConstraintsAssignment_8_2 )* )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1895:1: ( ( rule__Project__ConstraintsAssignment_8_2 )* )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1896:1: ( rule__Project__ConstraintsAssignment_8_2 )*
            {
             before(grammarAccess.getProjectAccess().getConstraintsAssignment_8_2()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1897:1: ( rule__Project__ConstraintsAssignment_8_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==24) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1897:2: rule__Project__ConstraintsAssignment_8_2
            	    {
            	    pushFollow(FOLLOW_rule__Project__ConstraintsAssignment_8_2_in_rule__Project__Group_8__2__Impl3817);
            	    rule__Project__ConstraintsAssignment_8_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getConstraintsAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_8__2__Impl"


    // $ANTLR start "rule__Project__Group_8__3"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1907:1: rule__Project__Group_8__3 : rule__Project__Group_8__3__Impl ;
    public final void rule__Project__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1911:1: ( rule__Project__Group_8__3__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1912:2: rule__Project__Group_8__3__Impl
            {
            pushFollow(FOLLOW_rule__Project__Group_8__3__Impl_in_rule__Project__Group_8__33848);
            rule__Project__Group_8__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_8__3"


    // $ANTLR start "rule__Project__Group_8__3__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1918:1: rule__Project__Group_8__3__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__Project__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1922:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1923:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1923:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1924:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_8_3()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__Project__Group_8__3__Impl3875); 
             after(grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_8__3__Impl"


    // $ANTLR start "rule__Assumption__Group__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1943:1: rule__Assumption__Group__0 : rule__Assumption__Group__0__Impl rule__Assumption__Group__1 ;
    public final void rule__Assumption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1947:1: ( rule__Assumption__Group__0__Impl rule__Assumption__Group__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1948:2: rule__Assumption__Group__0__Impl rule__Assumption__Group__1
            {
            pushFollow(FOLLOW_rule__Assumption__Group__0__Impl_in_rule__Assumption__Group__03912);
            rule__Assumption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assumption__Group__1_in_rule__Assumption__Group__03915);
            rule__Assumption__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assumption__Group__0"


    // $ANTLR start "rule__Assumption__Group__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1955:1: rule__Assumption__Group__0__Impl : ( '-' ) ;
    public final void rule__Assumption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1959:1: ( ( '-' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1960:1: ( '-' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1960:1: ( '-' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1961:1: '-'
            {
             before(grammarAccess.getAssumptionAccess().getHyphenMinusKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Assumption__Group__0__Impl3943); 
             after(grammarAccess.getAssumptionAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assumption__Group__0__Impl"


    // $ANTLR start "rule__Assumption__Group__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1974:1: rule__Assumption__Group__1 : rule__Assumption__Group__1__Impl rule__Assumption__Group__2 ;
    public final void rule__Assumption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1978:1: ( rule__Assumption__Group__1__Impl rule__Assumption__Group__2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1979:2: rule__Assumption__Group__1__Impl rule__Assumption__Group__2
            {
            pushFollow(FOLLOW_rule__Assumption__Group__1__Impl_in_rule__Assumption__Group__13974);
            rule__Assumption__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assumption__Group__2_in_rule__Assumption__Group__13977);
            rule__Assumption__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assumption__Group__1"


    // $ANTLR start "rule__Assumption__Group__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1986:1: rule__Assumption__Group__1__Impl : ( ( rule__Assumption__ValueAssignment_1 ) ) ;
    public final void rule__Assumption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1990:1: ( ( ( rule__Assumption__ValueAssignment_1 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1991:1: ( ( rule__Assumption__ValueAssignment_1 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1991:1: ( ( rule__Assumption__ValueAssignment_1 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1992:1: ( rule__Assumption__ValueAssignment_1 )
            {
             before(grammarAccess.getAssumptionAccess().getValueAssignment_1()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1993:1: ( rule__Assumption__ValueAssignment_1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1993:2: rule__Assumption__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Assumption__ValueAssignment_1_in_rule__Assumption__Group__1__Impl4004);
            rule__Assumption__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssumptionAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assumption__Group__1__Impl"


    // $ANTLR start "rule__Assumption__Group__2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2003:1: rule__Assumption__Group__2 : rule__Assumption__Group__2__Impl ;
    public final void rule__Assumption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2007:1: ( rule__Assumption__Group__2__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2008:2: rule__Assumption__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assumption__Group__2__Impl_in_rule__Assumption__Group__24034);
            rule__Assumption__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assumption__Group__2"


    // $ANTLR start "rule__Assumption__Group__2__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2014:1: rule__Assumption__Group__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Assumption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2018:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2019:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2019:1: ( ruleENDLINE )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2020:1: ruleENDLINE
            {
             before(grammarAccess.getAssumptionAccess().getENDLINEParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Assumption__Group__2__Impl4061);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getAssumptionAccess().getENDLINEParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assumption__Group__2__Impl"


    // $ANTLR start "rule__Constraint__Group__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2037:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2041:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2042:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__04096);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__04099);
            rule__Constraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0"


    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2049:1: rule__Constraint__Group__0__Impl : ( '-' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2053:1: ( ( '-' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2054:1: ( '-' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2054:1: ( '-' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2055:1: '-'
            {
             before(grammarAccess.getConstraintAccess().getHyphenMinusKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Constraint__Group__0__Impl4127); 
             after(grammarAccess.getConstraintAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0__Impl"


    // $ANTLR start "rule__Constraint__Group__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2068:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2072:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2073:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__14158);
            rule__Constraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__14161);
            rule__Constraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1"


    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2080:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__ValueAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2084:1: ( ( ( rule__Constraint__ValueAssignment_1 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2085:1: ( ( rule__Constraint__ValueAssignment_1 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2085:1: ( ( rule__Constraint__ValueAssignment_1 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2086:1: ( rule__Constraint__ValueAssignment_1 )
            {
             before(grammarAccess.getConstraintAccess().getValueAssignment_1()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2087:1: ( rule__Constraint__ValueAssignment_1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2087:2: rule__Constraint__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Constraint__ValueAssignment_1_in_rule__Constraint__Group__1__Impl4188);
            rule__Constraint__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1__Impl"


    // $ANTLR start "rule__Constraint__Group__2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2097:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2101:1: ( rule__Constraint__Group__2__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2102:2: rule__Constraint__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Constraint__Group__2__Impl_in_rule__Constraint__Group__24218);
            rule__Constraint__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2"


    // $ANTLR start "rule__Constraint__Group__2__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2108:1: rule__Constraint__Group__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2112:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2113:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2113:1: ( ruleENDLINE )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2114:1: ruleENDLINE
            {
             before(grammarAccess.getConstraintAccess().getENDLINEParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Constraint__Group__2__Impl4245);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getENDLINEParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2__Impl"


    // $ANTLR start "rule__ActivityGroup__Group__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2131:1: rule__ActivityGroup__Group__0 : rule__ActivityGroup__Group__0__Impl rule__ActivityGroup__Group__1 ;
    public final void rule__ActivityGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2135:1: ( rule__ActivityGroup__Group__0__Impl rule__ActivityGroup__Group__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2136:2: rule__ActivityGroup__Group__0__Impl rule__ActivityGroup__Group__1
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group__0__Impl_in_rule__ActivityGroup__Group__04280);
            rule__ActivityGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group__1_in_rule__ActivityGroup__Group__04283);
            rule__ActivityGroup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityGroup__Group__0"


    // $ANTLR start "rule__ActivityGroup__Group__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2143:1: rule__ActivityGroup__Group__0__Impl : ( ( rule__ActivityGroup__DescriptionAssignment_0 )? ) ;
    public final void rule__ActivityGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2147:1: ( ( ( rule__ActivityGroup__DescriptionAssignment_0 )? ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2148:1: ( ( rule__ActivityGroup__DescriptionAssignment_0 )? )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2148:1: ( ( rule__ActivityGroup__DescriptionAssignment_0 )? )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2149:1: ( rule__ActivityGroup__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getActivityGroupAccess().getDescriptionAssignment_0()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2150:1: ( rule__ActivityGroup__DescriptionAssignment_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ML_COMMENT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2150:2: rule__ActivityGroup__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ActivityGroup__DescriptionAssignment_0_in_rule__ActivityGroup__Group__0__Impl4310);
                    rule__ActivityGroup__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityGroupAccess().getDescriptionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityGroup__Group__0__Impl"


    // $ANTLR start "rule__ActivityGroup__Group__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2160:1: rule__ActivityGroup__Group__1 : rule__ActivityGroup__Group__1__Impl rule__ActivityGroup__Group__2 ;
    public final void rule__ActivityGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2164:1: ( rule__ActivityGroup__Group__1__Impl rule__ActivityGroup__Group__2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2165:2: rule__ActivityGroup__Group__1__Impl rule__ActivityGroup__Group__2
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group__1__Impl_in_rule__ActivityGroup__Group__14341);
            rule__ActivityGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group__2_in_rule__ActivityGroup__Group__14344);
            rule__ActivityGroup__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityGroup__Group__1"


    // $ANTLR start "rule__ActivityGroup__Group__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2172:1: rule__ActivityGroup__Group__1__Impl : ( 'Group' ) ;
    public final void rule__ActivityGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2176:1: ( ( 'Group' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2177:1: ( 'Group' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2177:1: ( 'Group' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2178:1: 'Group'
            {
             before(grammarAccess.getActivityGroupAccess().getGroupKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__ActivityGroup__Group__1__Impl4372); 
             after(grammarAccess.getActivityGroupAccess().getGroupKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityGroup__Group__1__Impl"


    // $ANTLR start "rule__ActivityGroup__Group__2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2191:1: rule__ActivityGroup__Group__2 : rule__ActivityGroup__Group__2__Impl rule__ActivityGroup__Group__3 ;
    public final void rule__ActivityGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2195:1: ( rule__ActivityGroup__Group__2__Impl rule__ActivityGroup__Group__3 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2196:2: rule__ActivityGroup__Group__2__Impl rule__ActivityGroup__Group__3
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group__2__Impl_in_rule__ActivityGroup__Group__24403);
            rule__ActivityGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group__3_in_rule__ActivityGroup__Group__24406);
            rule__ActivityGroup__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityGroup__Group__2"


    // $ANTLR start "rule__ActivityGroup__Group__2__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2203:1: rule__ActivityGroup__Group__2__Impl : ( ( rule__ActivityGroup__NameAssignment_2 ) ) ;
    public final void rule__ActivityGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2207:1: ( ( ( rule__ActivityGroup__NameAssignment_2 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2208:1: ( ( rule__ActivityGroup__NameAssignment_2 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2208:1: ( ( rule__ActivityGroup__NameAssignment_2 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2209:1: ( rule__ActivityGroup__NameAssignment_2 )
            {
             before(grammarAccess.getActivityGroupAccess().getNameAssignment_2()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2210:1: ( rule__ActivityGroup__NameAssignment_2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2210:2: rule__ActivityGroup__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ActivityGroup__NameAssignment_2_in_rule__ActivityGroup__Group__2__Impl4433);
            rule__ActivityGroup__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityGroupAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityGroup__Group__2__Impl"


    // $ANTLR start "rule__ActivityGroup__Group__3"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2220:1: rule__ActivityGroup__Group__3 : rule__ActivityGroup__Group__3__Impl rule__ActivityGroup__Group__4 ;
    public final void rule__ActivityGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2224:1: ( rule__ActivityGroup__Group__3__Impl rule__ActivityGroup__Group__4 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2225:2: rule__ActivityGroup__Group__3__Impl rule__ActivityGroup__Group__4
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group__3__Impl_in_rule__ActivityGroup__Group__34463);
            rule__ActivityGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group__4_in_rule__ActivityGroup__Group__34466);
            rule__ActivityGroup__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityGroup__Group__3"


    // $ANTLR start "rule__ActivityGroup__Group__3__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2232:1: rule__ActivityGroup__Group__3__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__ActivityGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2236:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2237:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2237:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2238:1: RULE_OPENCURLY
            {
             before(grammarAccess.getActivityGroupAccess().getOPENCURLYTerminalRuleCall_3()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__ActivityGroup__Group__3__Impl4493); 
             after(grammarAccess.getActivityGroupAccess().getOPENCURLYTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityGroup__Group__3__Impl"


    // $ANTLR start "rule__ActivityGroup__Group__4"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2249:1: rule__ActivityGroup__Group__4 : rule__ActivityGroup__Group__4__Impl rule__ActivityGroup__Group__5 ;
    public final void rule__ActivityGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2253:1: ( rule__ActivityGroup__Group__4__Impl rule__ActivityGroup__Group__5 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2254:2: rule__ActivityGroup__Group__4__Impl rule__ActivityGroup__Group__5
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group__4__Impl_in_rule__ActivityGroup__Group__44522);
            rule__ActivityGroup__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group__5_in_rule__ActivityGroup__Group__44525);
            rule__ActivityGroup__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityGroup__Group__4"


    // $ANTLR start "rule__ActivityGroup__Group__4__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2261:1: rule__ActivityGroup__Group__4__Impl : ( ( rule__ActivityGroup__Group_4__0 )? ) ;
    public final void rule__ActivityGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2265:1: ( ( ( rule__ActivityGroup__Group_4__0 )? ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2266:1: ( ( rule__ActivityGroup__Group_4__0 )? )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2266:1: ( ( rule__ActivityGroup__Group_4__0 )? )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2267:1: ( rule__ActivityGroup__Group_4__0 )?
            {
             before(grammarAccess.getActivityGroupAccess().getGroup_4()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2268:1: ( rule__ActivityGroup__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==19) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2268:2: rule__ActivityGroup__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ActivityGroup__Group_4__0_in_rule__ActivityGroup__Group__4__Impl4552);
                    rule__ActivityGroup__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityGroupAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityGroup__Group__4__Impl"


    // $ANTLR start "rule__ActivityGroup__Group__5"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2278:1: rule__ActivityGroup__Group__5 : rule__ActivityGroup__Group__5__Impl rule__ActivityGroup__Group__6 ;
    public final void rule__ActivityGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2282:1: ( rule__ActivityGroup__Group__5__Impl rule__ActivityGroup__Group__6 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2283:2: rule__ActivityGroup__Group__5__Impl rule__ActivityGroup__Group__6
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group__5__Impl_in_rule__ActivityGroup__Group__54583);
            rule__ActivityGroup__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group__6_in_rule__ActivityGroup__Group__54586);
            rule__ActivityGroup__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityGroup__Group__5"


    // $ANTLR start "rule__ActivityGroup__Group__5__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2290:1: rule__ActivityGroup__Group__5__Impl : ( ( rule__ActivityGroup__Group_5__0 )? ) ;
    public final void rule__ActivityGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2294:1: ( ( ( rule__ActivityGroup__Group_5__0 )? ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2295:1: ( ( rule__ActivityGroup__Group_5__0 )? )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2295:1: ( ( rule__ActivityGroup__Group_5__0 )? )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2296:1: ( rule__ActivityGroup__Group_5__0 )?
            {
             before(grammarAccess.getActivityGroupAccess().getGroup_5()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2297:1: ( rule__ActivityGroup__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2297:2: rule__ActivityGroup__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ActivityGroup__Group_5__0_in_rule__ActivityGroup__Group__5__Impl4613);
                    rule__ActivityGroup__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityGroupAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityGroup__Group__5__Impl"


    // $ANTLR start "rule__ActivityGroup__Group__6"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2307:1: rule__ActivityGroup__Group__6 : rule__ActivityGroup__Group__6__Impl rule__ActivityGroup__Group__7 ;
    public final void rule__ActivityGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2311:1: ( rule__ActivityGroup__Group__6__Impl rule__ActivityGroup__Group__7 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2312:2: rule__ActivityGroup__Group__6__Impl rule__ActivityGroup__Group__7
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group__6__Impl_in_rule__ActivityGroup__Group__64644);
            rule__ActivityGroup__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group__7_in_rule__ActivityGroup__Group__64647);
            rule__ActivityGroup__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityGroup__Group__6"


    // $ANTLR start "rule__ActivityGroup__Group__6__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2319:1: rule__ActivityGroup__Group__6__Impl : ( ( rule__ActivityGroup__ActivitiesAssignment_6 )* ) ;
    public final void rule__ActivityGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2323:1: ( ( ( rule__ActivityGroup__ActivitiesAssignment_6 )* ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2324:1: ( ( rule__ActivityGroup__ActivitiesAssignment_6 )* )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2324:1: ( ( rule__ActivityGroup__ActivitiesAssignment_6 )* )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2325:1: ( rule__ActivityGroup__ActivitiesAssignment_6 )*
            {
             before(grammarAccess.getActivityGroupAccess().getActivitiesAssignment_6()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2326:1: ( rule__ActivityGroup__ActivitiesAssignment_6 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ML_COMMENT||LA24_0==25||LA24_0==31||LA24_0==39) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2326:2: rule__ActivityGroup__ActivitiesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__ActivityGroup__ActivitiesAssignment_6_in_rule__ActivityGroup__Group__6__Impl4674);
            	    rule__ActivityGroup__ActivitiesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getActivityGroupAccess().getActivitiesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityGroup__Group__6__Impl"


    // $ANTLR start "rule__ActivityGroup__Group__7"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2336:1: rule__ActivityGroup__Group__7 : rule__ActivityGroup__Group__7__Impl ;
    public final void rule__ActivityGroup__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2340:1: ( rule__ActivityGroup__Group__7__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2341:2: rule__ActivityGroup__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group__7__Impl_in_rule__ActivityGroup__Group__74705);
            rule__ActivityGroup__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityGroup__Group__7"


    // $ANTLR start "rule__ActivityGroup__Group__7__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2347:1: rule__ActivityGroup__Group__7__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__ActivityGroup__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2351:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2352:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2352:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2353:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getActivityGroupAccess().getCLOSEDCURLYTerminalRuleCall_7()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__ActivityGroup__Group__7__Impl4732); 
             after(grammarAccess.getActivityGroupAccess().getCLOSEDCURLYTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityGroup__Group__7__Impl"


    // $ANTLR start "rule__ActivityGroup__Group_4__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2380:1: rule__ActivityGroup__Group_4__0 : rule__ActivityGroup__Group_4__0__Impl rule__ActivityGroup__Group_4__1 ;
    public final void rule__ActivityGroup__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2384:1: ( rule__ActivityGroup__Group_4__0__Impl rule__ActivityGroup__Group_4__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2385:2: rule__ActivityGroup__Group_4__0__Impl rule__ActivityGroup__Group_4__1
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group_4__0__Impl_in_rule__ActivityGroup__Group_4__04777);
            rule__ActivityGroup__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group_4__1_in_rule__ActivityGroup__Group_4__04780);
            rule__ActivityGroup__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityGroup__Group_4__0"


    // $ANTLR start "rule__ActivityGroup__Group_4__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2392:1: rule__ActivityGroup__Group_4__0__Impl : ( 'name' ) ;
    public final void rule__ActivityGroup__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2396:1: ( ( 'name' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2397:1: ( 'name' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2397:1: ( 'name' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2398:1: 'name'
            {
             before(grammarAccess.getActivityGroupAccess().getNameKeyword_4_0()); 
            match(input,19,FOLLOW_19_in_rule__ActivityGroup__Group_4__0__Impl4808); 
             after(grammarAccess.getActivityGroupAccess().getNameKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityGroup__Group_4__0__Impl"


    // $ANTLR start "rule__ActivityGroup__Group_4__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2411:1: rule__ActivityGroup__Group_4__1 : rule__ActivityGroup__Group_4__1__Impl rule__ActivityGroup__Group_4__2 ;
    public final void rule__ActivityGroup__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2415:1: ( rule__ActivityGroup__Group_4__1__Impl rule__ActivityGroup__Group_4__2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2416:2: rule__ActivityGroup__Group_4__1__Impl rule__ActivityGroup__Group_4__2
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group_4__1__Impl_in_rule__ActivityGroup__Group_4__14839);
            rule__ActivityGroup__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group_4__2_in_rule__ActivityGroup__Group_4__14842);
            rule__ActivityGroup__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityGroup__Group_4__1"


    // $ANTLR start "rule__ActivityGroup__Group_4__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2423:1: rule__ActivityGroup__Group_4__1__Impl : ( ( rule__ActivityGroup__LongNameAssignment_4_1 ) ) ;
    public final void rule__ActivityGroup__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2427:1: ( ( ( rule__ActivityGroup__LongNameAssignment_4_1 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2428:1: ( ( rule__ActivityGroup__LongNameAssignment_4_1 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2428:1: ( ( rule__ActivityGroup__LongNameAssignment_4_1 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2429:1: ( rule__ActivityGroup__LongNameAssignment_4_1 )
            {
             before(grammarAccess.getActivityGroupAccess().getLongNameAssignment_4_1()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2430:1: ( rule__ActivityGroup__LongNameAssignment_4_1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2430:2: rule__ActivityGroup__LongNameAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ActivityGroup__LongNameAssignment_4_1_in_rule__ActivityGroup__Group_4__1__Impl4869);
            rule__ActivityGroup__LongNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityGroupAccess().getLongNameAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityGroup__Group_4__1__Impl"


    // $ANTLR start "rule__ActivityGroup__Group_4__2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2440:1: rule__ActivityGroup__Group_4__2 : rule__ActivityGroup__Group_4__2__Impl ;
    public final void rule__ActivityGroup__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2444:1: ( rule__ActivityGroup__Group_4__2__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2445:2: rule__ActivityGroup__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group_4__2__Impl_in_rule__ActivityGroup__Group_4__24899);
            rule__ActivityGroup__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityGroup__Group_4__2"


    // $ANTLR start "rule__ActivityGroup__Group_4__2__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2451:1: rule__ActivityGroup__Group_4__2__Impl : ( ruleENDLINE ) ;
    public final void rule__ActivityGroup__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2455:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2456:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2456:1: ( ruleENDLINE )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2457:1: ruleENDLINE
            {
             before(grammarAccess.getActivityGroupAccess().getENDLINEParserRuleCall_4_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__ActivityGroup__Group_4__2__Impl4926);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getActivityGroupAccess().getENDLINEParserRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityGroup__Group_4__2__Impl"


    // $ANTLR start "rule__ActivityGroup__Group_5__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2474:1: rule__ActivityGroup__Group_5__0 : rule__ActivityGroup__Group_5__0__Impl rule__ActivityGroup__Group_5__1 ;
    public final void rule__ActivityGroup__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2478:1: ( rule__ActivityGroup__Group_5__0__Impl rule__ActivityGroup__Group_5__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2479:2: rule__ActivityGroup__Group_5__0__Impl rule__ActivityGroup__Group_5__1
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group_5__0__Impl_in_rule__ActivityGroup__Group_5__04961);
            rule__ActivityGroup__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group_5__1_in_rule__ActivityGroup__Group_5__04964);
            rule__ActivityGroup__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityGroup__Group_5__0"


    // $ANTLR start "rule__ActivityGroup__Group_5__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2486:1: rule__ActivityGroup__Group_5__0__Impl : ( 'dependsOn' ) ;
    public final void rule__ActivityGroup__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2490:1: ( ( 'dependsOn' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2491:1: ( 'dependsOn' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2491:1: ( 'dependsOn' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2492:1: 'dependsOn'
            {
             before(grammarAccess.getActivityGroupAccess().getDependsOnKeyword_5_0()); 
            match(input,26,FOLLOW_26_in_rule__ActivityGroup__Group_5__0__Impl4992); 
             after(grammarAccess.getActivityGroupAccess().getDependsOnKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityGroup__Group_5__0__Impl"


    // $ANTLR start "rule__ActivityGroup__Group_5__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2505:1: rule__ActivityGroup__Group_5__1 : rule__ActivityGroup__Group_5__1__Impl rule__ActivityGroup__Group_5__2 ;
    public final void rule__ActivityGroup__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2509:1: ( rule__ActivityGroup__Group_5__1__Impl rule__ActivityGroup__Group_5__2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2510:2: rule__ActivityGroup__Group_5__1__Impl rule__ActivityGroup__Group_5__2
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group_5__1__Impl_in_rule__ActivityGroup__Group_5__15023);
            rule__ActivityGroup__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group_5__2_in_rule__ActivityGroup__Group_5__15026);
            rule__ActivityGroup__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityGroup__Group_5__1"


    // $ANTLR start "rule__ActivityGroup__Group_5__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2517:1: rule__ActivityGroup__Group_5__1__Impl : ( ( rule__ActivityGroup__DependenciesAssignment_5_1 )* ) ;
    public final void rule__ActivityGroup__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2521:1: ( ( ( rule__ActivityGroup__DependenciesAssignment_5_1 )* ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2522:1: ( ( rule__ActivityGroup__DependenciesAssignment_5_1 )* )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2522:1: ( ( rule__ActivityGroup__DependenciesAssignment_5_1 )* )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2523:1: ( rule__ActivityGroup__DependenciesAssignment_5_1 )*
            {
             before(grammarAccess.getActivityGroupAccess().getDependenciesAssignment_5_1()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2524:1: ( rule__ActivityGroup__DependenciesAssignment_5_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2524:2: rule__ActivityGroup__DependenciesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__ActivityGroup__DependenciesAssignment_5_1_in_rule__ActivityGroup__Group_5__1__Impl5053);
            	    rule__ActivityGroup__DependenciesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getActivityGroupAccess().getDependenciesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityGroup__Group_5__1__Impl"


    // $ANTLR start "rule__ActivityGroup__Group_5__2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2534:1: rule__ActivityGroup__Group_5__2 : rule__ActivityGroup__Group_5__2__Impl ;
    public final void rule__ActivityGroup__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2538:1: ( rule__ActivityGroup__Group_5__2__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2539:2: rule__ActivityGroup__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group_5__2__Impl_in_rule__ActivityGroup__Group_5__25084);
            rule__ActivityGroup__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityGroup__Group_5__2"


    // $ANTLR start "rule__ActivityGroup__Group_5__2__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2545:1: rule__ActivityGroup__Group_5__2__Impl : ( ruleENDLINE ) ;
    public final void rule__ActivityGroup__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2549:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2550:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2550:1: ( ruleENDLINE )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2551:1: ruleENDLINE
            {
             before(grammarAccess.getActivityGroupAccess().getENDLINEParserRuleCall_5_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__ActivityGroup__Group_5__2__Impl5111);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getActivityGroupAccess().getENDLINEParserRuleCall_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityGroup__Group_5__2__Impl"


    // $ANTLR start "rule__PlanImport__Group__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2570:1: rule__PlanImport__Group__0 : rule__PlanImport__Group__0__Impl rule__PlanImport__Group__1 ;
    public final void rule__PlanImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2574:1: ( rule__PlanImport__Group__0__Impl rule__PlanImport__Group__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2575:2: rule__PlanImport__Group__0__Impl rule__PlanImport__Group__1
            {
            pushFollow(FOLLOW_rule__PlanImport__Group__0__Impl_in_rule__PlanImport__Group__05148);
            rule__PlanImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlanImport__Group__1_in_rule__PlanImport__Group__05151);
            rule__PlanImport__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlanImport__Group__0"


    // $ANTLR start "rule__PlanImport__Group__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2582:1: rule__PlanImport__Group__0__Impl : ( 'plan' ) ;
    public final void rule__PlanImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2586:1: ( ( 'plan' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2587:1: ( 'plan' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2587:1: ( 'plan' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2588:1: 'plan'
            {
             before(grammarAccess.getPlanImportAccess().getPlanKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__PlanImport__Group__0__Impl5179); 
             after(grammarAccess.getPlanImportAccess().getPlanKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlanImport__Group__0__Impl"


    // $ANTLR start "rule__PlanImport__Group__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2601:1: rule__PlanImport__Group__1 : rule__PlanImport__Group__1__Impl ;
    public final void rule__PlanImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2605:1: ( rule__PlanImport__Group__1__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2606:2: rule__PlanImport__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PlanImport__Group__1__Impl_in_rule__PlanImport__Group__15210);
            rule__PlanImport__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlanImport__Group__1"


    // $ANTLR start "rule__PlanImport__Group__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2612:1: rule__PlanImport__Group__1__Impl : ( ( rule__PlanImport__ImportURIAssignment_1 ) ) ;
    public final void rule__PlanImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2616:1: ( ( ( rule__PlanImport__ImportURIAssignment_1 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2617:1: ( ( rule__PlanImport__ImportURIAssignment_1 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2617:1: ( ( rule__PlanImport__ImportURIAssignment_1 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2618:1: ( rule__PlanImport__ImportURIAssignment_1 )
            {
             before(grammarAccess.getPlanImportAccess().getImportURIAssignment_1()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2619:1: ( rule__PlanImport__ImportURIAssignment_1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2619:2: rule__PlanImport__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__PlanImport__ImportURIAssignment_1_in_rule__PlanImport__Group__1__Impl5237);
            rule__PlanImport__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlanImportAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlanImport__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2633:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2637:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2638:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__05271);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__05274);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2645:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2649:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2650:1: ( RULE_ID )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2650:1: ( RULE_ID )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2651:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl5301); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2662:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2666:1: ( rule__QualifiedName__Group__1__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2667:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__15330);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2673:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2677:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2678:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2678:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2679:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2680:1: ( rule__QualifiedName__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==28) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2680:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl5357);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2694:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2698:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2699:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__05392);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__05395);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2706:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2710:1: ( ( '.' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2711:1: ( '.' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2711:1: ( '.' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2712:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__QualifiedName__Group_1__0__Impl5423); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2725:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2729:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2730:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__15454);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2736:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2740:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2741:1: ( RULE_ID )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2741:1: ( RULE_ID )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2742:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl5481); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Resources__Group__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2758:1: rule__Resources__Group__0 : rule__Resources__Group__0__Impl rule__Resources__Group__1 ;
    public final void rule__Resources__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2762:1: ( rule__Resources__Group__0__Impl rule__Resources__Group__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2763:2: rule__Resources__Group__0__Impl rule__Resources__Group__1
            {
            pushFollow(FOLLOW_rule__Resources__Group__0__Impl_in_rule__Resources__Group__05515);
            rule__Resources__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resources__Group__1_in_rule__Resources__Group__05518);
            rule__Resources__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__0"


    // $ANTLR start "rule__Resources__Group__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2770:1: rule__Resources__Group__0__Impl : ( 'Resources' ) ;
    public final void rule__Resources__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2774:1: ( ( 'Resources' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2775:1: ( 'Resources' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2775:1: ( 'Resources' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2776:1: 'Resources'
            {
             before(grammarAccess.getResourcesAccess().getResourcesKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Resources__Group__0__Impl5546); 
             after(grammarAccess.getResourcesAccess().getResourcesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__0__Impl"


    // $ANTLR start "rule__Resources__Group__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2789:1: rule__Resources__Group__1 : rule__Resources__Group__1__Impl rule__Resources__Group__2 ;
    public final void rule__Resources__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2793:1: ( rule__Resources__Group__1__Impl rule__Resources__Group__2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2794:2: rule__Resources__Group__1__Impl rule__Resources__Group__2
            {
            pushFollow(FOLLOW_rule__Resources__Group__1__Impl_in_rule__Resources__Group__15577);
            rule__Resources__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resources__Group__2_in_rule__Resources__Group__15580);
            rule__Resources__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__1"


    // $ANTLR start "rule__Resources__Group__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2801:1: rule__Resources__Group__1__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__Resources__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2805:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2806:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2806:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2807:1: RULE_OPENCURLY
            {
             before(grammarAccess.getResourcesAccess().getOPENCURLYTerminalRuleCall_1()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__Resources__Group__1__Impl5607); 
             after(grammarAccess.getResourcesAccess().getOPENCURLYTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__1__Impl"


    // $ANTLR start "rule__Resources__Group__2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2818:1: rule__Resources__Group__2 : rule__Resources__Group__2__Impl rule__Resources__Group__3 ;
    public final void rule__Resources__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2822:1: ( rule__Resources__Group__2__Impl rule__Resources__Group__3 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2823:2: rule__Resources__Group__2__Impl rule__Resources__Group__3
            {
            pushFollow(FOLLOW_rule__Resources__Group__2__Impl_in_rule__Resources__Group__25636);
            rule__Resources__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resources__Group__3_in_rule__Resources__Group__25639);
            rule__Resources__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__2"


    // $ANTLR start "rule__Resources__Group__2__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2830:1: rule__Resources__Group__2__Impl : ( ( rule__Resources__ResourceAssignment_2 )* ) ;
    public final void rule__Resources__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2834:1: ( ( ( rule__Resources__ResourceAssignment_2 )* ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2835:1: ( ( rule__Resources__ResourceAssignment_2 )* )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2835:1: ( ( rule__Resources__ResourceAssignment_2 )* )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2836:1: ( rule__Resources__ResourceAssignment_2 )*
            {
             before(grammarAccess.getResourcesAccess().getResourceAssignment_2()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2837:1: ( rule__Resources__ResourceAssignment_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==30) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2837:2: rule__Resources__ResourceAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Resources__ResourceAssignment_2_in_rule__Resources__Group__2__Impl5666);
            	    rule__Resources__ResourceAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getResourcesAccess().getResourceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__2__Impl"


    // $ANTLR start "rule__Resources__Group__3"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2847:1: rule__Resources__Group__3 : rule__Resources__Group__3__Impl ;
    public final void rule__Resources__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2851:1: ( rule__Resources__Group__3__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2852:2: rule__Resources__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Resources__Group__3__Impl_in_rule__Resources__Group__35697);
            rule__Resources__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__3"


    // $ANTLR start "rule__Resources__Group__3__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2858:1: rule__Resources__Group__3__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__Resources__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2862:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2863:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2863:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2864:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getResourcesAccess().getCLOSEDCURLYTerminalRuleCall_3()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__Resources__Group__3__Impl5724); 
             after(grammarAccess.getResourcesAccess().getCLOSEDCURLYTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__3__Impl"


    // $ANTLR start "rule__Resource__Group__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2883:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2887:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2888:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
            {
            pushFollow(FOLLOW_rule__Resource__Group__0__Impl_in_rule__Resource__Group__05761);
            rule__Resource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__1_in_rule__Resource__Group__05764);
            rule__Resource__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__0"


    // $ANTLR start "rule__Resource__Group__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2895:1: rule__Resource__Group__0__Impl : ( 'Resource' ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2899:1: ( ( 'Resource' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2900:1: ( 'Resource' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2900:1: ( 'Resource' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2901:1: 'Resource'
            {
             before(grammarAccess.getResourceAccess().getResourceKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Resource__Group__0__Impl5792); 
             after(grammarAccess.getResourceAccess().getResourceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__0__Impl"


    // $ANTLR start "rule__Resource__Group__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2914:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl rule__Resource__Group__2 ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2918:1: ( rule__Resource__Group__1__Impl rule__Resource__Group__2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2919:2: rule__Resource__Group__1__Impl rule__Resource__Group__2
            {
            pushFollow(FOLLOW_rule__Resource__Group__1__Impl_in_rule__Resource__Group__15823);
            rule__Resource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__2_in_rule__Resource__Group__15826);
            rule__Resource__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__1"


    // $ANTLR start "rule__Resource__Group__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2926:1: rule__Resource__Group__1__Impl : ( ( rule__Resource__NameAssignment_1 ) ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2930:1: ( ( ( rule__Resource__NameAssignment_1 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2931:1: ( ( rule__Resource__NameAssignment_1 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2931:1: ( ( rule__Resource__NameAssignment_1 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2932:1: ( rule__Resource__NameAssignment_1 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_1()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2933:1: ( rule__Resource__NameAssignment_1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2933:2: rule__Resource__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Resource__NameAssignment_1_in_rule__Resource__Group__1__Impl5853);
            rule__Resource__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__1__Impl"


    // $ANTLR start "rule__Resource__Group__2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2943:1: rule__Resource__Group__2 : rule__Resource__Group__2__Impl ;
    public final void rule__Resource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2947:1: ( rule__Resource__Group__2__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2948:2: rule__Resource__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Resource__Group__2__Impl_in_rule__Resource__Group__25883);
            rule__Resource__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__2"


    // $ANTLR start "rule__Resource__Group__2__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2954:1: rule__Resource__Group__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Resource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2958:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2959:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2959:1: ( ruleENDLINE )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2960:1: ruleENDLINE
            {
             before(grammarAccess.getResourceAccess().getENDLINEParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Resource__Group__2__Impl5910);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getENDLINEParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__2__Impl"


    // $ANTLR start "rule__CheckPoint__Group__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2977:1: rule__CheckPoint__Group__0 : rule__CheckPoint__Group__0__Impl rule__CheckPoint__Group__1 ;
    public final void rule__CheckPoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2981:1: ( rule__CheckPoint__Group__0__Impl rule__CheckPoint__Group__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2982:2: rule__CheckPoint__Group__0__Impl rule__CheckPoint__Group__1
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group__0__Impl_in_rule__CheckPoint__Group__05945);
            rule__CheckPoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group__1_in_rule__CheckPoint__Group__05948);
            rule__CheckPoint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group__0"


    // $ANTLR start "rule__CheckPoint__Group__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2989:1: rule__CheckPoint__Group__0__Impl : ( ( rule__CheckPoint__DescriptionAssignment_0 )? ) ;
    public final void rule__CheckPoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2993:1: ( ( ( rule__CheckPoint__DescriptionAssignment_0 )? ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2994:1: ( ( rule__CheckPoint__DescriptionAssignment_0 )? )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2994:1: ( ( rule__CheckPoint__DescriptionAssignment_0 )? )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2995:1: ( rule__CheckPoint__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getCheckPointAccess().getDescriptionAssignment_0()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2996:1: ( rule__CheckPoint__DescriptionAssignment_0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ML_COMMENT) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2996:2: rule__CheckPoint__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__DescriptionAssignment_0_in_rule__CheckPoint__Group__0__Impl5975);
                    rule__CheckPoint__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheckPointAccess().getDescriptionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group__0__Impl"


    // $ANTLR start "rule__CheckPoint__Group__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3006:1: rule__CheckPoint__Group__1 : rule__CheckPoint__Group__1__Impl rule__CheckPoint__Group__2 ;
    public final void rule__CheckPoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3010:1: ( rule__CheckPoint__Group__1__Impl rule__CheckPoint__Group__2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3011:2: rule__CheckPoint__Group__1__Impl rule__CheckPoint__Group__2
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group__1__Impl_in_rule__CheckPoint__Group__16006);
            rule__CheckPoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group__2_in_rule__CheckPoint__Group__16009);
            rule__CheckPoint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group__1"


    // $ANTLR start "rule__CheckPoint__Group__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3018:1: rule__CheckPoint__Group__1__Impl : ( 'CheckPoint' ) ;
    public final void rule__CheckPoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3022:1: ( ( 'CheckPoint' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3023:1: ( 'CheckPoint' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3023:1: ( 'CheckPoint' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3024:1: 'CheckPoint'
            {
             before(grammarAccess.getCheckPointAccess().getCheckPointKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__CheckPoint__Group__1__Impl6037); 
             after(grammarAccess.getCheckPointAccess().getCheckPointKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group__1__Impl"


    // $ANTLR start "rule__CheckPoint__Group__2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3037:1: rule__CheckPoint__Group__2 : rule__CheckPoint__Group__2__Impl rule__CheckPoint__Group__3 ;
    public final void rule__CheckPoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3041:1: ( rule__CheckPoint__Group__2__Impl rule__CheckPoint__Group__3 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3042:2: rule__CheckPoint__Group__2__Impl rule__CheckPoint__Group__3
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group__2__Impl_in_rule__CheckPoint__Group__26068);
            rule__CheckPoint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group__3_in_rule__CheckPoint__Group__26071);
            rule__CheckPoint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group__2"


    // $ANTLR start "rule__CheckPoint__Group__2__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3049:1: rule__CheckPoint__Group__2__Impl : ( ( rule__CheckPoint__NameAssignment_2 ) ) ;
    public final void rule__CheckPoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3053:1: ( ( ( rule__CheckPoint__NameAssignment_2 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3054:1: ( ( rule__CheckPoint__NameAssignment_2 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3054:1: ( ( rule__CheckPoint__NameAssignment_2 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3055:1: ( rule__CheckPoint__NameAssignment_2 )
            {
             before(grammarAccess.getCheckPointAccess().getNameAssignment_2()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3056:1: ( rule__CheckPoint__NameAssignment_2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3056:2: rule__CheckPoint__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__CheckPoint__NameAssignment_2_in_rule__CheckPoint__Group__2__Impl6098);
            rule__CheckPoint__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCheckPointAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group__2__Impl"


    // $ANTLR start "rule__CheckPoint__Group__3"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3066:1: rule__CheckPoint__Group__3 : rule__CheckPoint__Group__3__Impl rule__CheckPoint__Group__4 ;
    public final void rule__CheckPoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3070:1: ( rule__CheckPoint__Group__3__Impl rule__CheckPoint__Group__4 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3071:2: rule__CheckPoint__Group__3__Impl rule__CheckPoint__Group__4
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group__3__Impl_in_rule__CheckPoint__Group__36128);
            rule__CheckPoint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group__4_in_rule__CheckPoint__Group__36131);
            rule__CheckPoint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group__3"


    // $ANTLR start "rule__CheckPoint__Group__3__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3078:1: rule__CheckPoint__Group__3__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__CheckPoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3082:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3083:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3083:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3084:1: RULE_OPENCURLY
            {
             before(grammarAccess.getCheckPointAccess().getOPENCURLYTerminalRuleCall_3()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__CheckPoint__Group__3__Impl6158); 
             after(grammarAccess.getCheckPointAccess().getOPENCURLYTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group__3__Impl"


    // $ANTLR start "rule__CheckPoint__Group__4"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3095:1: rule__CheckPoint__Group__4 : rule__CheckPoint__Group__4__Impl rule__CheckPoint__Group__5 ;
    public final void rule__CheckPoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3099:1: ( rule__CheckPoint__Group__4__Impl rule__CheckPoint__Group__5 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3100:2: rule__CheckPoint__Group__4__Impl rule__CheckPoint__Group__5
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group__4__Impl_in_rule__CheckPoint__Group__46187);
            rule__CheckPoint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group__5_in_rule__CheckPoint__Group__46190);
            rule__CheckPoint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group__4"


    // $ANTLR start "rule__CheckPoint__Group__4__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3107:1: rule__CheckPoint__Group__4__Impl : ( ( rule__CheckPoint__Group_4__0 )? ) ;
    public final void rule__CheckPoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3111:1: ( ( ( rule__CheckPoint__Group_4__0 )? ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3112:1: ( ( rule__CheckPoint__Group_4__0 )? )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3112:1: ( ( rule__CheckPoint__Group_4__0 )? )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3113:1: ( rule__CheckPoint__Group_4__0 )?
            {
             before(grammarAccess.getCheckPointAccess().getGroup_4()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3114:1: ( rule__CheckPoint__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==19) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3114:2: rule__CheckPoint__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__Group_4__0_in_rule__CheckPoint__Group__4__Impl6217);
                    rule__CheckPoint__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheckPointAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group__4__Impl"


    // $ANTLR start "rule__CheckPoint__Group__5"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3124:1: rule__CheckPoint__Group__5 : rule__CheckPoint__Group__5__Impl rule__CheckPoint__Group__6 ;
    public final void rule__CheckPoint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3128:1: ( rule__CheckPoint__Group__5__Impl rule__CheckPoint__Group__6 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3129:2: rule__CheckPoint__Group__5__Impl rule__CheckPoint__Group__6
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group__5__Impl_in_rule__CheckPoint__Group__56248);
            rule__CheckPoint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group__6_in_rule__CheckPoint__Group__56251);
            rule__CheckPoint__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group__5"


    // $ANTLR start "rule__CheckPoint__Group__5__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3136:1: rule__CheckPoint__Group__5__Impl : ( ( rule__CheckPoint__UnorderedGroup_5 ) ) ;
    public final void rule__CheckPoint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3140:1: ( ( ( rule__CheckPoint__UnorderedGroup_5 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3141:1: ( ( rule__CheckPoint__UnorderedGroup_5 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3141:1: ( ( rule__CheckPoint__UnorderedGroup_5 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3142:1: ( rule__CheckPoint__UnorderedGroup_5 )
            {
             before(grammarAccess.getCheckPointAccess().getUnorderedGroup_5()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3143:1: ( rule__CheckPoint__UnorderedGroup_5 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3143:2: rule__CheckPoint__UnorderedGroup_5
            {
            pushFollow(FOLLOW_rule__CheckPoint__UnorderedGroup_5_in_rule__CheckPoint__Group__5__Impl6278);
            rule__CheckPoint__UnorderedGroup_5();

            state._fsp--;


            }

             after(grammarAccess.getCheckPointAccess().getUnorderedGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group__5__Impl"


    // $ANTLR start "rule__CheckPoint__Group__6"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3153:1: rule__CheckPoint__Group__6 : rule__CheckPoint__Group__6__Impl ;
    public final void rule__CheckPoint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3157:1: ( rule__CheckPoint__Group__6__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3158:2: rule__CheckPoint__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group__6__Impl_in_rule__CheckPoint__Group__66308);
            rule__CheckPoint__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group__6"


    // $ANTLR start "rule__CheckPoint__Group__6__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3164:1: rule__CheckPoint__Group__6__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__CheckPoint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3168:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3169:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3169:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3170:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getCheckPointAccess().getCLOSEDCURLYTerminalRuleCall_6()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__CheckPoint__Group__6__Impl6335); 
             after(grammarAccess.getCheckPointAccess().getCLOSEDCURLYTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group__6__Impl"


    // $ANTLR start "rule__CheckPoint__Group_4__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3195:1: rule__CheckPoint__Group_4__0 : rule__CheckPoint__Group_4__0__Impl rule__CheckPoint__Group_4__1 ;
    public final void rule__CheckPoint__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3199:1: ( rule__CheckPoint__Group_4__0__Impl rule__CheckPoint__Group_4__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3200:2: rule__CheckPoint__Group_4__0__Impl rule__CheckPoint__Group_4__1
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_4__0__Impl_in_rule__CheckPoint__Group_4__06378);
            rule__CheckPoint__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_4__1_in_rule__CheckPoint__Group_4__06381);
            rule__CheckPoint__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_4__0"


    // $ANTLR start "rule__CheckPoint__Group_4__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3207:1: rule__CheckPoint__Group_4__0__Impl : ( 'name' ) ;
    public final void rule__CheckPoint__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3211:1: ( ( 'name' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3212:1: ( 'name' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3212:1: ( 'name' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3213:1: 'name'
            {
             before(grammarAccess.getCheckPointAccess().getNameKeyword_4_0()); 
            match(input,19,FOLLOW_19_in_rule__CheckPoint__Group_4__0__Impl6409); 
             after(grammarAccess.getCheckPointAccess().getNameKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_4__0__Impl"


    // $ANTLR start "rule__CheckPoint__Group_4__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3226:1: rule__CheckPoint__Group_4__1 : rule__CheckPoint__Group_4__1__Impl rule__CheckPoint__Group_4__2 ;
    public final void rule__CheckPoint__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3230:1: ( rule__CheckPoint__Group_4__1__Impl rule__CheckPoint__Group_4__2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3231:2: rule__CheckPoint__Group_4__1__Impl rule__CheckPoint__Group_4__2
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_4__1__Impl_in_rule__CheckPoint__Group_4__16440);
            rule__CheckPoint__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_4__2_in_rule__CheckPoint__Group_4__16443);
            rule__CheckPoint__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_4__1"


    // $ANTLR start "rule__CheckPoint__Group_4__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3238:1: rule__CheckPoint__Group_4__1__Impl : ( ( rule__CheckPoint__LongNameAssignment_4_1 ) ) ;
    public final void rule__CheckPoint__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3242:1: ( ( ( rule__CheckPoint__LongNameAssignment_4_1 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3243:1: ( ( rule__CheckPoint__LongNameAssignment_4_1 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3243:1: ( ( rule__CheckPoint__LongNameAssignment_4_1 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3244:1: ( rule__CheckPoint__LongNameAssignment_4_1 )
            {
             before(grammarAccess.getCheckPointAccess().getLongNameAssignment_4_1()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3245:1: ( rule__CheckPoint__LongNameAssignment_4_1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3245:2: rule__CheckPoint__LongNameAssignment_4_1
            {
            pushFollow(FOLLOW_rule__CheckPoint__LongNameAssignment_4_1_in_rule__CheckPoint__Group_4__1__Impl6470);
            rule__CheckPoint__LongNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckPointAccess().getLongNameAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_4__1__Impl"


    // $ANTLR start "rule__CheckPoint__Group_4__2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3255:1: rule__CheckPoint__Group_4__2 : rule__CheckPoint__Group_4__2__Impl ;
    public final void rule__CheckPoint__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3259:1: ( rule__CheckPoint__Group_4__2__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3260:2: rule__CheckPoint__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_4__2__Impl_in_rule__CheckPoint__Group_4__26500);
            rule__CheckPoint__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_4__2"


    // $ANTLR start "rule__CheckPoint__Group_4__2__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3266:1: rule__CheckPoint__Group_4__2__Impl : ( ruleENDLINE ) ;
    public final void rule__CheckPoint__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3270:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3271:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3271:1: ( ruleENDLINE )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3272:1: ruleENDLINE
            {
             before(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_4_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_4__2__Impl6527);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_4__2__Impl"


    // $ANTLR start "rule__CheckPoint__Group_5_0_0__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3289:1: rule__CheckPoint__Group_5_0_0__0 : rule__CheckPoint__Group_5_0_0__0__Impl rule__CheckPoint__Group_5_0_0__1 ;
    public final void rule__CheckPoint__Group_5_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3293:1: ( rule__CheckPoint__Group_5_0_0__0__Impl rule__CheckPoint__Group_5_0_0__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3294:2: rule__CheckPoint__Group_5_0_0__0__Impl rule__CheckPoint__Group_5_0_0__1
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_5_0_0__0__Impl_in_rule__CheckPoint__Group_5_0_0__06562);
            rule__CheckPoint__Group_5_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_5_0_0__1_in_rule__CheckPoint__Group_5_0_0__06565);
            rule__CheckPoint__Group_5_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_5_0_0__0"


    // $ANTLR start "rule__CheckPoint__Group_5_0_0__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3301:1: rule__CheckPoint__Group_5_0_0__0__Impl : ( 'date' ) ;
    public final void rule__CheckPoint__Group_5_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3305:1: ( ( 'date' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3306:1: ( 'date' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3306:1: ( 'date' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3307:1: 'date'
            {
             before(grammarAccess.getCheckPointAccess().getDateKeyword_5_0_0_0()); 
            match(input,32,FOLLOW_32_in_rule__CheckPoint__Group_5_0_0__0__Impl6593); 
             after(grammarAccess.getCheckPointAccess().getDateKeyword_5_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_5_0_0__0__Impl"


    // $ANTLR start "rule__CheckPoint__Group_5_0_0__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3320:1: rule__CheckPoint__Group_5_0_0__1 : rule__CheckPoint__Group_5_0_0__1__Impl rule__CheckPoint__Group_5_0_0__2 ;
    public final void rule__CheckPoint__Group_5_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3324:1: ( rule__CheckPoint__Group_5_0_0__1__Impl rule__CheckPoint__Group_5_0_0__2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3325:2: rule__CheckPoint__Group_5_0_0__1__Impl rule__CheckPoint__Group_5_0_0__2
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_5_0_0__1__Impl_in_rule__CheckPoint__Group_5_0_0__16624);
            rule__CheckPoint__Group_5_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_5_0_0__2_in_rule__CheckPoint__Group_5_0_0__16627);
            rule__CheckPoint__Group_5_0_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_5_0_0__1"


    // $ANTLR start "rule__CheckPoint__Group_5_0_0__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3332:1: rule__CheckPoint__Group_5_0_0__1__Impl : ( ( rule__CheckPoint__EndAssignment_5_0_0_1 ) ) ;
    public final void rule__CheckPoint__Group_5_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3336:1: ( ( ( rule__CheckPoint__EndAssignment_5_0_0_1 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3337:1: ( ( rule__CheckPoint__EndAssignment_5_0_0_1 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3337:1: ( ( rule__CheckPoint__EndAssignment_5_0_0_1 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3338:1: ( rule__CheckPoint__EndAssignment_5_0_0_1 )
            {
             before(grammarAccess.getCheckPointAccess().getEndAssignment_5_0_0_1()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3339:1: ( rule__CheckPoint__EndAssignment_5_0_0_1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3339:2: rule__CheckPoint__EndAssignment_5_0_0_1
            {
            pushFollow(FOLLOW_rule__CheckPoint__EndAssignment_5_0_0_1_in_rule__CheckPoint__Group_5_0_0__1__Impl6654);
            rule__CheckPoint__EndAssignment_5_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckPointAccess().getEndAssignment_5_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_5_0_0__1__Impl"


    // $ANTLR start "rule__CheckPoint__Group_5_0_0__2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3349:1: rule__CheckPoint__Group_5_0_0__2 : rule__CheckPoint__Group_5_0_0__2__Impl ;
    public final void rule__CheckPoint__Group_5_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3353:1: ( rule__CheckPoint__Group_5_0_0__2__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3354:2: rule__CheckPoint__Group_5_0_0__2__Impl
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_5_0_0__2__Impl_in_rule__CheckPoint__Group_5_0_0__26684);
            rule__CheckPoint__Group_5_0_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_5_0_0__2"


    // $ANTLR start "rule__CheckPoint__Group_5_0_0__2__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3360:1: rule__CheckPoint__Group_5_0_0__2__Impl : ( ruleENDLINE ) ;
    public final void rule__CheckPoint__Group_5_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3364:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3365:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3365:1: ( ruleENDLINE )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3366:1: ruleENDLINE
            {
             before(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_5_0_0_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_5_0_0__2__Impl6711);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_5_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_5_0_0__2__Impl"


    // $ANTLR start "rule__CheckPoint__Group_5_0_1__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3383:1: rule__CheckPoint__Group_5_0_1__0 : rule__CheckPoint__Group_5_0_1__0__Impl rule__CheckPoint__Group_5_0_1__1 ;
    public final void rule__CheckPoint__Group_5_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3387:1: ( rule__CheckPoint__Group_5_0_1__0__Impl rule__CheckPoint__Group_5_0_1__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3388:2: rule__CheckPoint__Group_5_0_1__0__Impl rule__CheckPoint__Group_5_0_1__1
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_5_0_1__0__Impl_in_rule__CheckPoint__Group_5_0_1__06746);
            rule__CheckPoint__Group_5_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_5_0_1__1_in_rule__CheckPoint__Group_5_0_1__06749);
            rule__CheckPoint__Group_5_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_5_0_1__0"


    // $ANTLR start "rule__CheckPoint__Group_5_0_1__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3395:1: rule__CheckPoint__Group_5_0_1__0__Impl : ( 'after' ) ;
    public final void rule__CheckPoint__Group_5_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3399:1: ( ( 'after' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3400:1: ( 'after' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3400:1: ( 'after' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3401:1: 'after'
            {
             before(grammarAccess.getCheckPointAccess().getAfterKeyword_5_0_1_0()); 
            match(input,33,FOLLOW_33_in_rule__CheckPoint__Group_5_0_1__0__Impl6777); 
             after(grammarAccess.getCheckPointAccess().getAfterKeyword_5_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_5_0_1__0__Impl"


    // $ANTLR start "rule__CheckPoint__Group_5_0_1__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3414:1: rule__CheckPoint__Group_5_0_1__1 : rule__CheckPoint__Group_5_0_1__1__Impl rule__CheckPoint__Group_5_0_1__2 ;
    public final void rule__CheckPoint__Group_5_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3418:1: ( rule__CheckPoint__Group_5_0_1__1__Impl rule__CheckPoint__Group_5_0_1__2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3419:2: rule__CheckPoint__Group_5_0_1__1__Impl rule__CheckPoint__Group_5_0_1__2
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_5_0_1__1__Impl_in_rule__CheckPoint__Group_5_0_1__16808);
            rule__CheckPoint__Group_5_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_5_0_1__2_in_rule__CheckPoint__Group_5_0_1__16811);
            rule__CheckPoint__Group_5_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_5_0_1__1"


    // $ANTLR start "rule__CheckPoint__Group_5_0_1__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3426:1: rule__CheckPoint__Group_5_0_1__1__Impl : ( ( rule__CheckPoint__AfterAssignment_5_0_1_1 ) ) ;
    public final void rule__CheckPoint__Group_5_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3430:1: ( ( ( rule__CheckPoint__AfterAssignment_5_0_1_1 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3431:1: ( ( rule__CheckPoint__AfterAssignment_5_0_1_1 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3431:1: ( ( rule__CheckPoint__AfterAssignment_5_0_1_1 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3432:1: ( rule__CheckPoint__AfterAssignment_5_0_1_1 )
            {
             before(grammarAccess.getCheckPointAccess().getAfterAssignment_5_0_1_1()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3433:1: ( rule__CheckPoint__AfterAssignment_5_0_1_1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3433:2: rule__CheckPoint__AfterAssignment_5_0_1_1
            {
            pushFollow(FOLLOW_rule__CheckPoint__AfterAssignment_5_0_1_1_in_rule__CheckPoint__Group_5_0_1__1__Impl6838);
            rule__CheckPoint__AfterAssignment_5_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckPointAccess().getAfterAssignment_5_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_5_0_1__1__Impl"


    // $ANTLR start "rule__CheckPoint__Group_5_0_1__2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3443:1: rule__CheckPoint__Group_5_0_1__2 : rule__CheckPoint__Group_5_0_1__2__Impl rule__CheckPoint__Group_5_0_1__3 ;
    public final void rule__CheckPoint__Group_5_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3447:1: ( rule__CheckPoint__Group_5_0_1__2__Impl rule__CheckPoint__Group_5_0_1__3 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3448:2: rule__CheckPoint__Group_5_0_1__2__Impl rule__CheckPoint__Group_5_0_1__3
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_5_0_1__2__Impl_in_rule__CheckPoint__Group_5_0_1__26868);
            rule__CheckPoint__Group_5_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_5_0_1__3_in_rule__CheckPoint__Group_5_0_1__26871);
            rule__CheckPoint__Group_5_0_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_5_0_1__2"


    // $ANTLR start "rule__CheckPoint__Group_5_0_1__2__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3455:1: rule__CheckPoint__Group_5_0_1__2__Impl : ( 'offset' ) ;
    public final void rule__CheckPoint__Group_5_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3459:1: ( ( 'offset' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3460:1: ( 'offset' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3460:1: ( 'offset' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3461:1: 'offset'
            {
             before(grammarAccess.getCheckPointAccess().getOffsetKeyword_5_0_1_2()); 
            match(input,34,FOLLOW_34_in_rule__CheckPoint__Group_5_0_1__2__Impl6899); 
             after(grammarAccess.getCheckPointAccess().getOffsetKeyword_5_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_5_0_1__2__Impl"


    // $ANTLR start "rule__CheckPoint__Group_5_0_1__3"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3474:1: rule__CheckPoint__Group_5_0_1__3 : rule__CheckPoint__Group_5_0_1__3__Impl rule__CheckPoint__Group_5_0_1__4 ;
    public final void rule__CheckPoint__Group_5_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3478:1: ( rule__CheckPoint__Group_5_0_1__3__Impl rule__CheckPoint__Group_5_0_1__4 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3479:2: rule__CheckPoint__Group_5_0_1__3__Impl rule__CheckPoint__Group_5_0_1__4
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_5_0_1__3__Impl_in_rule__CheckPoint__Group_5_0_1__36930);
            rule__CheckPoint__Group_5_0_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_5_0_1__4_in_rule__CheckPoint__Group_5_0_1__36933);
            rule__CheckPoint__Group_5_0_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_5_0_1__3"


    // $ANTLR start "rule__CheckPoint__Group_5_0_1__3__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3486:1: rule__CheckPoint__Group_5_0_1__3__Impl : ( ( rule__CheckPoint__OffsetAssignment_5_0_1_3 ) ) ;
    public final void rule__CheckPoint__Group_5_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3490:1: ( ( ( rule__CheckPoint__OffsetAssignment_5_0_1_3 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3491:1: ( ( rule__CheckPoint__OffsetAssignment_5_0_1_3 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3491:1: ( ( rule__CheckPoint__OffsetAssignment_5_0_1_3 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3492:1: ( rule__CheckPoint__OffsetAssignment_5_0_1_3 )
            {
             before(grammarAccess.getCheckPointAccess().getOffsetAssignment_5_0_1_3()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3493:1: ( rule__CheckPoint__OffsetAssignment_5_0_1_3 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3493:2: rule__CheckPoint__OffsetAssignment_5_0_1_3
            {
            pushFollow(FOLLOW_rule__CheckPoint__OffsetAssignment_5_0_1_3_in_rule__CheckPoint__Group_5_0_1__3__Impl6960);
            rule__CheckPoint__OffsetAssignment_5_0_1_3();

            state._fsp--;


            }

             after(grammarAccess.getCheckPointAccess().getOffsetAssignment_5_0_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_5_0_1__3__Impl"


    // $ANTLR start "rule__CheckPoint__Group_5_0_1__4"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3503:1: rule__CheckPoint__Group_5_0_1__4 : rule__CheckPoint__Group_5_0_1__4__Impl ;
    public final void rule__CheckPoint__Group_5_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3507:1: ( rule__CheckPoint__Group_5_0_1__4__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3508:2: rule__CheckPoint__Group_5_0_1__4__Impl
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_5_0_1__4__Impl_in_rule__CheckPoint__Group_5_0_1__46990);
            rule__CheckPoint__Group_5_0_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_5_0_1__4"


    // $ANTLR start "rule__CheckPoint__Group_5_0_1__4__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3514:1: rule__CheckPoint__Group_5_0_1__4__Impl : ( ruleENDLINE ) ;
    public final void rule__CheckPoint__Group_5_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3518:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3519:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3519:1: ( ruleENDLINE )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3520:1: ruleENDLINE
            {
             before(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_5_0_1_4()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_5_0_1__4__Impl7017);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_5_0_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_5_0_1__4__Impl"


    // $ANTLR start "rule__CheckPoint__Group_5_1__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3541:1: rule__CheckPoint__Group_5_1__0 : rule__CheckPoint__Group_5_1__0__Impl rule__CheckPoint__Group_5_1__1 ;
    public final void rule__CheckPoint__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3545:1: ( rule__CheckPoint__Group_5_1__0__Impl rule__CheckPoint__Group_5_1__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3546:2: rule__CheckPoint__Group_5_1__0__Impl rule__CheckPoint__Group_5_1__1
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_5_1__0__Impl_in_rule__CheckPoint__Group_5_1__07056);
            rule__CheckPoint__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_5_1__1_in_rule__CheckPoint__Group_5_1__07059);
            rule__CheckPoint__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_5_1__0"


    // $ANTLR start "rule__CheckPoint__Group_5_1__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3553:1: rule__CheckPoint__Group_5_1__0__Impl : ( 'completeness' ) ;
    public final void rule__CheckPoint__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3557:1: ( ( 'completeness' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3558:1: ( 'completeness' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3558:1: ( 'completeness' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3559:1: 'completeness'
            {
             before(grammarAccess.getCheckPointAccess().getCompletenessKeyword_5_1_0()); 
            match(input,35,FOLLOW_35_in_rule__CheckPoint__Group_5_1__0__Impl7087); 
             after(grammarAccess.getCheckPointAccess().getCompletenessKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_5_1__0__Impl"


    // $ANTLR start "rule__CheckPoint__Group_5_1__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3572:1: rule__CheckPoint__Group_5_1__1 : rule__CheckPoint__Group_5_1__1__Impl rule__CheckPoint__Group_5_1__2 ;
    public final void rule__CheckPoint__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3576:1: ( rule__CheckPoint__Group_5_1__1__Impl rule__CheckPoint__Group_5_1__2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3577:2: rule__CheckPoint__Group_5_1__1__Impl rule__CheckPoint__Group_5_1__2
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_5_1__1__Impl_in_rule__CheckPoint__Group_5_1__17118);
            rule__CheckPoint__Group_5_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_5_1__2_in_rule__CheckPoint__Group_5_1__17121);
            rule__CheckPoint__Group_5_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_5_1__1"


    // $ANTLR start "rule__CheckPoint__Group_5_1__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3584:1: rule__CheckPoint__Group_5_1__1__Impl : ( ( rule__CheckPoint__CompletenessAssignment_5_1_1 ) ) ;
    public final void rule__CheckPoint__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3588:1: ( ( ( rule__CheckPoint__CompletenessAssignment_5_1_1 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3589:1: ( ( rule__CheckPoint__CompletenessAssignment_5_1_1 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3589:1: ( ( rule__CheckPoint__CompletenessAssignment_5_1_1 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3590:1: ( rule__CheckPoint__CompletenessAssignment_5_1_1 )
            {
             before(grammarAccess.getCheckPointAccess().getCompletenessAssignment_5_1_1()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3591:1: ( rule__CheckPoint__CompletenessAssignment_5_1_1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3591:2: rule__CheckPoint__CompletenessAssignment_5_1_1
            {
            pushFollow(FOLLOW_rule__CheckPoint__CompletenessAssignment_5_1_1_in_rule__CheckPoint__Group_5_1__1__Impl7148);
            rule__CheckPoint__CompletenessAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckPointAccess().getCompletenessAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_5_1__1__Impl"


    // $ANTLR start "rule__CheckPoint__Group_5_1__2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3601:1: rule__CheckPoint__Group_5_1__2 : rule__CheckPoint__Group_5_1__2__Impl rule__CheckPoint__Group_5_1__3 ;
    public final void rule__CheckPoint__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3605:1: ( rule__CheckPoint__Group_5_1__2__Impl rule__CheckPoint__Group_5_1__3 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3606:2: rule__CheckPoint__Group_5_1__2__Impl rule__CheckPoint__Group_5_1__3
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_5_1__2__Impl_in_rule__CheckPoint__Group_5_1__27178);
            rule__CheckPoint__Group_5_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_5_1__3_in_rule__CheckPoint__Group_5_1__27181);
            rule__CheckPoint__Group_5_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_5_1__2"


    // $ANTLR start "rule__CheckPoint__Group_5_1__2__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3613:1: rule__CheckPoint__Group_5_1__2__Impl : ( '%' ) ;
    public final void rule__CheckPoint__Group_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3617:1: ( ( '%' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3618:1: ( '%' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3618:1: ( '%' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3619:1: '%'
            {
             before(grammarAccess.getCheckPointAccess().getPercentSignKeyword_5_1_2()); 
            match(input,36,FOLLOW_36_in_rule__CheckPoint__Group_5_1__2__Impl7209); 
             after(grammarAccess.getCheckPointAccess().getPercentSignKeyword_5_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_5_1__2__Impl"


    // $ANTLR start "rule__CheckPoint__Group_5_1__3"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3632:1: rule__CheckPoint__Group_5_1__3 : rule__CheckPoint__Group_5_1__3__Impl rule__CheckPoint__Group_5_1__4 ;
    public final void rule__CheckPoint__Group_5_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3636:1: ( rule__CheckPoint__Group_5_1__3__Impl rule__CheckPoint__Group_5_1__4 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3637:2: rule__CheckPoint__Group_5_1__3__Impl rule__CheckPoint__Group_5_1__4
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_5_1__3__Impl_in_rule__CheckPoint__Group_5_1__37240);
            rule__CheckPoint__Group_5_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_5_1__4_in_rule__CheckPoint__Group_5_1__37243);
            rule__CheckPoint__Group_5_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_5_1__3"


    // $ANTLR start "rule__CheckPoint__Group_5_1__3__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3644:1: rule__CheckPoint__Group_5_1__3__Impl : ( ruleENDLINE ) ;
    public final void rule__CheckPoint__Group_5_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3648:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3649:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3649:1: ( ruleENDLINE )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3650:1: ruleENDLINE
            {
             before(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_5_1_3()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_5_1__3__Impl7270);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_5_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_5_1__3__Impl"


    // $ANTLR start "rule__CheckPoint__Group_5_1__4"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3661:1: rule__CheckPoint__Group_5_1__4 : rule__CheckPoint__Group_5_1__4__Impl ;
    public final void rule__CheckPoint__Group_5_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3665:1: ( rule__CheckPoint__Group_5_1__4__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3666:2: rule__CheckPoint__Group_5_1__4__Impl
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_5_1__4__Impl_in_rule__CheckPoint__Group_5_1__47299);
            rule__CheckPoint__Group_5_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_5_1__4"


    // $ANTLR start "rule__CheckPoint__Group_5_1__4__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3672:1: rule__CheckPoint__Group_5_1__4__Impl : ( ( rule__CheckPoint__Group_5_1_4__0 )? ) ;
    public final void rule__CheckPoint__Group_5_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3676:1: ( ( ( rule__CheckPoint__Group_5_1_4__0 )? ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3677:1: ( ( rule__CheckPoint__Group_5_1_4__0 )? )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3677:1: ( ( rule__CheckPoint__Group_5_1_4__0 )? )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3678:1: ( rule__CheckPoint__Group_5_1_4__0 )?
            {
             before(grammarAccess.getCheckPointAccess().getGroup_5_1_4()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3679:1: ( rule__CheckPoint__Group_5_1_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==26) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3679:2: rule__CheckPoint__Group_5_1_4__0
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__Group_5_1_4__0_in_rule__CheckPoint__Group_5_1__4__Impl7326);
                    rule__CheckPoint__Group_5_1_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheckPointAccess().getGroup_5_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_5_1__4__Impl"


    // $ANTLR start "rule__CheckPoint__Group_5_1_4__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3699:1: rule__CheckPoint__Group_5_1_4__0 : rule__CheckPoint__Group_5_1_4__0__Impl rule__CheckPoint__Group_5_1_4__1 ;
    public final void rule__CheckPoint__Group_5_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3703:1: ( rule__CheckPoint__Group_5_1_4__0__Impl rule__CheckPoint__Group_5_1_4__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3704:2: rule__CheckPoint__Group_5_1_4__0__Impl rule__CheckPoint__Group_5_1_4__1
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_5_1_4__0__Impl_in_rule__CheckPoint__Group_5_1_4__07367);
            rule__CheckPoint__Group_5_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_5_1_4__1_in_rule__CheckPoint__Group_5_1_4__07370);
            rule__CheckPoint__Group_5_1_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_5_1_4__0"


    // $ANTLR start "rule__CheckPoint__Group_5_1_4__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3711:1: rule__CheckPoint__Group_5_1_4__0__Impl : ( 'dependsOn' ) ;
    public final void rule__CheckPoint__Group_5_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3715:1: ( ( 'dependsOn' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3716:1: ( 'dependsOn' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3716:1: ( 'dependsOn' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3717:1: 'dependsOn'
            {
             before(grammarAccess.getCheckPointAccess().getDependsOnKeyword_5_1_4_0()); 
            match(input,26,FOLLOW_26_in_rule__CheckPoint__Group_5_1_4__0__Impl7398); 
             after(grammarAccess.getCheckPointAccess().getDependsOnKeyword_5_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_5_1_4__0__Impl"


    // $ANTLR start "rule__CheckPoint__Group_5_1_4__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3730:1: rule__CheckPoint__Group_5_1_4__1 : rule__CheckPoint__Group_5_1_4__1__Impl rule__CheckPoint__Group_5_1_4__2 ;
    public final void rule__CheckPoint__Group_5_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3734:1: ( rule__CheckPoint__Group_5_1_4__1__Impl rule__CheckPoint__Group_5_1_4__2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3735:2: rule__CheckPoint__Group_5_1_4__1__Impl rule__CheckPoint__Group_5_1_4__2
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_5_1_4__1__Impl_in_rule__CheckPoint__Group_5_1_4__17429);
            rule__CheckPoint__Group_5_1_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_5_1_4__2_in_rule__CheckPoint__Group_5_1_4__17432);
            rule__CheckPoint__Group_5_1_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_5_1_4__1"


    // $ANTLR start "rule__CheckPoint__Group_5_1_4__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3742:1: rule__CheckPoint__Group_5_1_4__1__Impl : ( ( rule__CheckPoint__DependenciesAssignment_5_1_4_1 )* ) ;
    public final void rule__CheckPoint__Group_5_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3746:1: ( ( ( rule__CheckPoint__DependenciesAssignment_5_1_4_1 )* ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3747:1: ( ( rule__CheckPoint__DependenciesAssignment_5_1_4_1 )* )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3747:1: ( ( rule__CheckPoint__DependenciesAssignment_5_1_4_1 )* )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3748:1: ( rule__CheckPoint__DependenciesAssignment_5_1_4_1 )*
            {
             before(grammarAccess.getCheckPointAccess().getDependenciesAssignment_5_1_4_1()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3749:1: ( rule__CheckPoint__DependenciesAssignment_5_1_4_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3749:2: rule__CheckPoint__DependenciesAssignment_5_1_4_1
            	    {
            	    pushFollow(FOLLOW_rule__CheckPoint__DependenciesAssignment_5_1_4_1_in_rule__CheckPoint__Group_5_1_4__1__Impl7459);
            	    rule__CheckPoint__DependenciesAssignment_5_1_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getCheckPointAccess().getDependenciesAssignment_5_1_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_5_1_4__1__Impl"


    // $ANTLR start "rule__CheckPoint__Group_5_1_4__2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3759:1: rule__CheckPoint__Group_5_1_4__2 : rule__CheckPoint__Group_5_1_4__2__Impl ;
    public final void rule__CheckPoint__Group_5_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3763:1: ( rule__CheckPoint__Group_5_1_4__2__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3764:2: rule__CheckPoint__Group_5_1_4__2__Impl
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_5_1_4__2__Impl_in_rule__CheckPoint__Group_5_1_4__27490);
            rule__CheckPoint__Group_5_1_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_5_1_4__2"


    // $ANTLR start "rule__CheckPoint__Group_5_1_4__2__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3770:1: rule__CheckPoint__Group_5_1_4__2__Impl : ( ruleENDLINE ) ;
    public final void rule__CheckPoint__Group_5_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3774:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3775:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3775:1: ( ruleENDLINE )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3776:1: ruleENDLINE
            {
             before(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_5_1_4_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_5_1_4__2__Impl7517);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_5_1_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__Group_5_1_4__2__Impl"


    // $ANTLR start "rule__ResourceInvolvement__Group__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3793:1: rule__ResourceInvolvement__Group__0 : rule__ResourceInvolvement__Group__0__Impl rule__ResourceInvolvement__Group__1 ;
    public final void rule__ResourceInvolvement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3797:1: ( rule__ResourceInvolvement__Group__0__Impl rule__ResourceInvolvement__Group__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3798:2: rule__ResourceInvolvement__Group__0__Impl rule__ResourceInvolvement__Group__1
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group__0__Impl_in_rule__ResourceInvolvement__Group__07552);
            rule__ResourceInvolvement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceInvolvement__Group__1_in_rule__ResourceInvolvement__Group__07555);
            rule__ResourceInvolvement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceInvolvement__Group__0"


    // $ANTLR start "rule__ResourceInvolvement__Group__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3805:1: rule__ResourceInvolvement__Group__0__Impl : ( ( rule__ResourceInvolvement__ResourceAssignment_0 ) ) ;
    public final void rule__ResourceInvolvement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3809:1: ( ( ( rule__ResourceInvolvement__ResourceAssignment_0 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3810:1: ( ( rule__ResourceInvolvement__ResourceAssignment_0 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3810:1: ( ( rule__ResourceInvolvement__ResourceAssignment_0 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3811:1: ( rule__ResourceInvolvement__ResourceAssignment_0 )
            {
             before(grammarAccess.getResourceInvolvementAccess().getResourceAssignment_0()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3812:1: ( rule__ResourceInvolvement__ResourceAssignment_0 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3812:2: rule__ResourceInvolvement__ResourceAssignment_0
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__ResourceAssignment_0_in_rule__ResourceInvolvement__Group__0__Impl7582);
            rule__ResourceInvolvement__ResourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getResourceInvolvementAccess().getResourceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceInvolvement__Group__0__Impl"


    // $ANTLR start "rule__ResourceInvolvement__Group__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3822:1: rule__ResourceInvolvement__Group__1 : rule__ResourceInvolvement__Group__1__Impl rule__ResourceInvolvement__Group__2 ;
    public final void rule__ResourceInvolvement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3826:1: ( rule__ResourceInvolvement__Group__1__Impl rule__ResourceInvolvement__Group__2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3827:2: rule__ResourceInvolvement__Group__1__Impl rule__ResourceInvolvement__Group__2
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group__1__Impl_in_rule__ResourceInvolvement__Group__17612);
            rule__ResourceInvolvement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceInvolvement__Group__2_in_rule__ResourceInvolvement__Group__17615);
            rule__ResourceInvolvement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceInvolvement__Group__1"


    // $ANTLR start "rule__ResourceInvolvement__Group__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3834:1: rule__ResourceInvolvement__Group__1__Impl : ( ( rule__ResourceInvolvement__Group_1__0 )? ) ;
    public final void rule__ResourceInvolvement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3838:1: ( ( ( rule__ResourceInvolvement__Group_1__0 )? ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3839:1: ( ( rule__ResourceInvolvement__Group_1__0 )? )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3839:1: ( ( rule__ResourceInvolvement__Group_1__0 )? )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3840:1: ( rule__ResourceInvolvement__Group_1__0 )?
            {
             before(grammarAccess.getResourceInvolvementAccess().getGroup_1()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3841:1: ( rule__ResourceInvolvement__Group_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==37) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3841:2: rule__ResourceInvolvement__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ResourceInvolvement__Group_1__0_in_rule__ResourceInvolvement__Group__1__Impl7642);
                    rule__ResourceInvolvement__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourceInvolvementAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceInvolvement__Group__1__Impl"


    // $ANTLR start "rule__ResourceInvolvement__Group__2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3851:1: rule__ResourceInvolvement__Group__2 : rule__ResourceInvolvement__Group__2__Impl rule__ResourceInvolvement__Group__3 ;
    public final void rule__ResourceInvolvement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3855:1: ( rule__ResourceInvolvement__Group__2__Impl rule__ResourceInvolvement__Group__3 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3856:2: rule__ResourceInvolvement__Group__2__Impl rule__ResourceInvolvement__Group__3
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group__2__Impl_in_rule__ResourceInvolvement__Group__27673);
            rule__ResourceInvolvement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceInvolvement__Group__3_in_rule__ResourceInvolvement__Group__27676);
            rule__ResourceInvolvement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceInvolvement__Group__2"


    // $ANTLR start "rule__ResourceInvolvement__Group__2__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3863:1: rule__ResourceInvolvement__Group__2__Impl : ( ( rule__ResourceInvolvement__Group_2__0 )? ) ;
    public final void rule__ResourceInvolvement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3867:1: ( ( ( rule__ResourceInvolvement__Group_2__0 )? ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3868:1: ( ( rule__ResourceInvolvement__Group_2__0 )? )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3868:1: ( ( rule__ResourceInvolvement__Group_2__0 )? )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3869:1: ( rule__ResourceInvolvement__Group_2__0 )?
            {
             before(grammarAccess.getResourceInvolvementAccess().getGroup_2()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3870:1: ( rule__ResourceInvolvement__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==38) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3870:2: rule__ResourceInvolvement__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ResourceInvolvement__Group_2__0_in_rule__ResourceInvolvement__Group__2__Impl7703);
                    rule__ResourceInvolvement__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourceInvolvementAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceInvolvement__Group__2__Impl"


    // $ANTLR start "rule__ResourceInvolvement__Group__3"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3880:1: rule__ResourceInvolvement__Group__3 : rule__ResourceInvolvement__Group__3__Impl ;
    public final void rule__ResourceInvolvement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3884:1: ( rule__ResourceInvolvement__Group__3__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3885:2: rule__ResourceInvolvement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group__3__Impl_in_rule__ResourceInvolvement__Group__37734);
            rule__ResourceInvolvement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceInvolvement__Group__3"


    // $ANTLR start "rule__ResourceInvolvement__Group__3__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3891:1: rule__ResourceInvolvement__Group__3__Impl : ( ruleENDLINE ) ;
    public final void rule__ResourceInvolvement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3895:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3896:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3896:1: ( ruleENDLINE )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3897:1: ruleENDLINE
            {
             before(grammarAccess.getResourceInvolvementAccess().getENDLINEParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__ResourceInvolvement__Group__3__Impl7761);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getResourceInvolvementAccess().getENDLINEParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceInvolvement__Group__3__Impl"


    // $ANTLR start "rule__ResourceInvolvement__Group_1__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3916:1: rule__ResourceInvolvement__Group_1__0 : rule__ResourceInvolvement__Group_1__0__Impl rule__ResourceInvolvement__Group_1__1 ;
    public final void rule__ResourceInvolvement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3920:1: ( rule__ResourceInvolvement__Group_1__0__Impl rule__ResourceInvolvement__Group_1__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3921:2: rule__ResourceInvolvement__Group_1__0__Impl rule__ResourceInvolvement__Group_1__1
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group_1__0__Impl_in_rule__ResourceInvolvement__Group_1__07798);
            rule__ResourceInvolvement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceInvolvement__Group_1__1_in_rule__ResourceInvolvement__Group_1__07801);
            rule__ResourceInvolvement__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceInvolvement__Group_1__0"


    // $ANTLR start "rule__ResourceInvolvement__Group_1__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3928:1: rule__ResourceInvolvement__Group_1__0__Impl : ( 'at' ) ;
    public final void rule__ResourceInvolvement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3932:1: ( ( 'at' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3933:1: ( 'at' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3933:1: ( 'at' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3934:1: 'at'
            {
             before(grammarAccess.getResourceInvolvementAccess().getAtKeyword_1_0()); 
            match(input,37,FOLLOW_37_in_rule__ResourceInvolvement__Group_1__0__Impl7829); 
             after(grammarAccess.getResourceInvolvementAccess().getAtKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceInvolvement__Group_1__0__Impl"


    // $ANTLR start "rule__ResourceInvolvement__Group_1__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3947:1: rule__ResourceInvolvement__Group_1__1 : rule__ResourceInvolvement__Group_1__1__Impl rule__ResourceInvolvement__Group_1__2 ;
    public final void rule__ResourceInvolvement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3951:1: ( rule__ResourceInvolvement__Group_1__1__Impl rule__ResourceInvolvement__Group_1__2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3952:2: rule__ResourceInvolvement__Group_1__1__Impl rule__ResourceInvolvement__Group_1__2
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group_1__1__Impl_in_rule__ResourceInvolvement__Group_1__17860);
            rule__ResourceInvolvement__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceInvolvement__Group_1__2_in_rule__ResourceInvolvement__Group_1__17863);
            rule__ResourceInvolvement__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceInvolvement__Group_1__1"


    // $ANTLR start "rule__ResourceInvolvement__Group_1__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3959:1: rule__ResourceInvolvement__Group_1__1__Impl : ( ( rule__ResourceInvolvement__OccupationAssignment_1_1 ) ) ;
    public final void rule__ResourceInvolvement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3963:1: ( ( ( rule__ResourceInvolvement__OccupationAssignment_1_1 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3964:1: ( ( rule__ResourceInvolvement__OccupationAssignment_1_1 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3964:1: ( ( rule__ResourceInvolvement__OccupationAssignment_1_1 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3965:1: ( rule__ResourceInvolvement__OccupationAssignment_1_1 )
            {
             before(grammarAccess.getResourceInvolvementAccess().getOccupationAssignment_1_1()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3966:1: ( rule__ResourceInvolvement__OccupationAssignment_1_1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3966:2: rule__ResourceInvolvement__OccupationAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__OccupationAssignment_1_1_in_rule__ResourceInvolvement__Group_1__1__Impl7890);
            rule__ResourceInvolvement__OccupationAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceInvolvementAccess().getOccupationAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceInvolvement__Group_1__1__Impl"


    // $ANTLR start "rule__ResourceInvolvement__Group_1__2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3976:1: rule__ResourceInvolvement__Group_1__2 : rule__ResourceInvolvement__Group_1__2__Impl ;
    public final void rule__ResourceInvolvement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3980:1: ( rule__ResourceInvolvement__Group_1__2__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3981:2: rule__ResourceInvolvement__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group_1__2__Impl_in_rule__ResourceInvolvement__Group_1__27920);
            rule__ResourceInvolvement__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceInvolvement__Group_1__2"


    // $ANTLR start "rule__ResourceInvolvement__Group_1__2__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3987:1: rule__ResourceInvolvement__Group_1__2__Impl : ( '%' ) ;
    public final void rule__ResourceInvolvement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3991:1: ( ( '%' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3992:1: ( '%' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3992:1: ( '%' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3993:1: '%'
            {
             before(grammarAccess.getResourceInvolvementAccess().getPercentSignKeyword_1_2()); 
            match(input,36,FOLLOW_36_in_rule__ResourceInvolvement__Group_1__2__Impl7948); 
             after(grammarAccess.getResourceInvolvementAccess().getPercentSignKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceInvolvement__Group_1__2__Impl"


    // $ANTLR start "rule__ResourceInvolvement__Group_2__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4012:1: rule__ResourceInvolvement__Group_2__0 : rule__ResourceInvolvement__Group_2__0__Impl rule__ResourceInvolvement__Group_2__1 ;
    public final void rule__ResourceInvolvement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4016:1: ( rule__ResourceInvolvement__Group_2__0__Impl rule__ResourceInvolvement__Group_2__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4017:2: rule__ResourceInvolvement__Group_2__0__Impl rule__ResourceInvolvement__Group_2__1
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group_2__0__Impl_in_rule__ResourceInvolvement__Group_2__07985);
            rule__ResourceInvolvement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceInvolvement__Group_2__1_in_rule__ResourceInvolvement__Group_2__07988);
            rule__ResourceInvolvement__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceInvolvement__Group_2__0"


    // $ANTLR start "rule__ResourceInvolvement__Group_2__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4024:1: rule__ResourceInvolvement__Group_2__0__Impl : ( 'as' ) ;
    public final void rule__ResourceInvolvement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4028:1: ( ( 'as' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4029:1: ( 'as' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4029:1: ( 'as' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4030:1: 'as'
            {
             before(grammarAccess.getResourceInvolvementAccess().getAsKeyword_2_0()); 
            match(input,38,FOLLOW_38_in_rule__ResourceInvolvement__Group_2__0__Impl8016); 
             after(grammarAccess.getResourceInvolvementAccess().getAsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceInvolvement__Group_2__0__Impl"


    // $ANTLR start "rule__ResourceInvolvement__Group_2__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4043:1: rule__ResourceInvolvement__Group_2__1 : rule__ResourceInvolvement__Group_2__1__Impl ;
    public final void rule__ResourceInvolvement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4047:1: ( rule__ResourceInvolvement__Group_2__1__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4048:2: rule__ResourceInvolvement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group_2__1__Impl_in_rule__ResourceInvolvement__Group_2__18047);
            rule__ResourceInvolvement__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceInvolvement__Group_2__1"


    // $ANTLR start "rule__ResourceInvolvement__Group_2__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4054:1: rule__ResourceInvolvement__Group_2__1__Impl : ( ( rule__ResourceInvolvement__ResponsibilityAssignment_2_1 ) ) ;
    public final void rule__ResourceInvolvement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4058:1: ( ( ( rule__ResourceInvolvement__ResponsibilityAssignment_2_1 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4059:1: ( ( rule__ResourceInvolvement__ResponsibilityAssignment_2_1 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4059:1: ( ( rule__ResourceInvolvement__ResponsibilityAssignment_2_1 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4060:1: ( rule__ResourceInvolvement__ResponsibilityAssignment_2_1 )
            {
             before(grammarAccess.getResourceInvolvementAccess().getResponsibilityAssignment_2_1()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4061:1: ( rule__ResourceInvolvement__ResponsibilityAssignment_2_1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4061:2: rule__ResourceInvolvement__ResponsibilityAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__ResponsibilityAssignment_2_1_in_rule__ResourceInvolvement__Group_2__1__Impl8074);
            rule__ResourceInvolvement__ResponsibilityAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceInvolvementAccess().getResponsibilityAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceInvolvement__Group_2__1__Impl"


    // $ANTLR start "rule__Activity__Group__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4075:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4079:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4080:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__08108);
            rule__Activity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__08111);
            rule__Activity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__0"


    // $ANTLR start "rule__Activity__Group__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4087:1: rule__Activity__Group__0__Impl : ( ( rule__Activity__DescriptionAssignment_0 )? ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4091:1: ( ( ( rule__Activity__DescriptionAssignment_0 )? ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4092:1: ( ( rule__Activity__DescriptionAssignment_0 )? )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4092:1: ( ( rule__Activity__DescriptionAssignment_0 )? )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4093:1: ( rule__Activity__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getActivityAccess().getDescriptionAssignment_0()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4094:1: ( rule__Activity__DescriptionAssignment_0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ML_COMMENT) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4094:2: rule__Activity__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Activity__DescriptionAssignment_0_in_rule__Activity__Group__0__Impl8138);
                    rule__Activity__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getDescriptionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__0__Impl"


    // $ANTLR start "rule__Activity__Group__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4104:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4108:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4109:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__18169);
            rule__Activity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__18172);
            rule__Activity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__1"


    // $ANTLR start "rule__Activity__Group__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4116:1: rule__Activity__Group__1__Impl : ( 'Activity' ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4120:1: ( ( 'Activity' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4121:1: ( 'Activity' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4121:1: ( 'Activity' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4122:1: 'Activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__Activity__Group__1__Impl8200); 
             after(grammarAccess.getActivityAccess().getActivityKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__1__Impl"


    // $ANTLR start "rule__Activity__Group__2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4135:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4139:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4140:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__28231);
            rule__Activity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__28234);
            rule__Activity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__2"


    // $ANTLR start "rule__Activity__Group__2__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4147:1: rule__Activity__Group__2__Impl : ( ( rule__Activity__NameAssignment_2 ) ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4151:1: ( ( ( rule__Activity__NameAssignment_2 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4152:1: ( ( rule__Activity__NameAssignment_2 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4152:1: ( ( rule__Activity__NameAssignment_2 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4153:1: ( rule__Activity__NameAssignment_2 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_2()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4154:1: ( rule__Activity__NameAssignment_2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4154:2: rule__Activity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Activity__NameAssignment_2_in_rule__Activity__Group__2__Impl8261);
            rule__Activity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__2__Impl"


    // $ANTLR start "rule__Activity__Group__3"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4164:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4168:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4169:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__38291);
            rule__Activity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__38294);
            rule__Activity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__3"


    // $ANTLR start "rule__Activity__Group__3__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4176:1: rule__Activity__Group__3__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4180:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4181:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4181:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4182:1: RULE_OPENCURLY
            {
             before(grammarAccess.getActivityAccess().getOPENCURLYTerminalRuleCall_3()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__Activity__Group__3__Impl8321); 
             after(grammarAccess.getActivityAccess().getOPENCURLYTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__3__Impl"


    // $ANTLR start "rule__Activity__Group__4"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4193:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl rule__Activity__Group__5 ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4197:1: ( rule__Activity__Group__4__Impl rule__Activity__Group__5 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4198:2: rule__Activity__Group__4__Impl rule__Activity__Group__5
            {
            pushFollow(FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__48350);
            rule__Activity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__48353);
            rule__Activity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__4"


    // $ANTLR start "rule__Activity__Group__4__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4205:1: rule__Activity__Group__4__Impl : ( ( rule__Activity__Group_4__0 )? ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4209:1: ( ( ( rule__Activity__Group_4__0 )? ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4210:1: ( ( rule__Activity__Group_4__0 )? )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4210:1: ( ( rule__Activity__Group_4__0 )? )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4211:1: ( rule__Activity__Group_4__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_4()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4212:1: ( rule__Activity__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==19) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4212:2: rule__Activity__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_4__0_in_rule__Activity__Group__4__Impl8380);
                    rule__Activity__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__4__Impl"


    // $ANTLR start "rule__Activity__Group__5"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4222:1: rule__Activity__Group__5 : rule__Activity__Group__5__Impl rule__Activity__Group__6 ;
    public final void rule__Activity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4226:1: ( rule__Activity__Group__5__Impl rule__Activity__Group__6 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4227:2: rule__Activity__Group__5__Impl rule__Activity__Group__6
            {
            pushFollow(FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__58411);
            rule__Activity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__58414);
            rule__Activity__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__5"


    // $ANTLR start "rule__Activity__Group__5__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4234:1: rule__Activity__Group__5__Impl : ( ( rule__Activity__Group_5__0 )? ) ;
    public final void rule__Activity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4238:1: ( ( ( rule__Activity__Group_5__0 )? ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4239:1: ( ( rule__Activity__Group_5__0 )? )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4239:1: ( ( rule__Activity__Group_5__0 )? )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4240:1: ( rule__Activity__Group_5__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_5()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4241:1: ( rule__Activity__Group_5__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==40) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4241:2: rule__Activity__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_5__0_in_rule__Activity__Group__5__Impl8441);
                    rule__Activity__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__5__Impl"


    // $ANTLR start "rule__Activity__Group__6"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4251:1: rule__Activity__Group__6 : rule__Activity__Group__6__Impl rule__Activity__Group__7 ;
    public final void rule__Activity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4255:1: ( rule__Activity__Group__6__Impl rule__Activity__Group__7 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4256:2: rule__Activity__Group__6__Impl rule__Activity__Group__7
            {
            pushFollow(FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__68472);
            rule__Activity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__68475);
            rule__Activity__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__6"


    // $ANTLR start "rule__Activity__Group__6__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4263:1: rule__Activity__Group__6__Impl : ( ( rule__Activity__UnorderedGroup_6 ) ) ;
    public final void rule__Activity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4267:1: ( ( ( rule__Activity__UnorderedGroup_6 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4268:1: ( ( rule__Activity__UnorderedGroup_6 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4268:1: ( ( rule__Activity__UnorderedGroup_6 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4269:1: ( rule__Activity__UnorderedGroup_6 )
            {
             before(grammarAccess.getActivityAccess().getUnorderedGroup_6()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4270:1: ( rule__Activity__UnorderedGroup_6 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4270:2: rule__Activity__UnorderedGroup_6
            {
            pushFollow(FOLLOW_rule__Activity__UnorderedGroup_6_in_rule__Activity__Group__6__Impl8502);
            rule__Activity__UnorderedGroup_6();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getUnorderedGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__6__Impl"


    // $ANTLR start "rule__Activity__Group__7"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4280:1: rule__Activity__Group__7 : rule__Activity__Group__7__Impl ;
    public final void rule__Activity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4284:1: ( rule__Activity__Group__7__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4285:2: rule__Activity__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__78532);
            rule__Activity__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__7"


    // $ANTLR start "rule__Activity__Group__7__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4291:1: rule__Activity__Group__7__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__Activity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4295:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4296:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4296:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4297:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getActivityAccess().getCLOSEDCURLYTerminalRuleCall_7()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__Activity__Group__7__Impl8559); 
             after(grammarAccess.getActivityAccess().getCLOSEDCURLYTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__7__Impl"


    // $ANTLR start "rule__Activity__Group_4__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4324:1: rule__Activity__Group_4__0 : rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 ;
    public final void rule__Activity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4328:1: ( rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4329:2: rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_4__0__Impl_in_rule__Activity__Group_4__08604);
            rule__Activity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_4__1_in_rule__Activity__Group_4__08607);
            rule__Activity__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__0"


    // $ANTLR start "rule__Activity__Group_4__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4336:1: rule__Activity__Group_4__0__Impl : ( 'name' ) ;
    public final void rule__Activity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4340:1: ( ( 'name' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4341:1: ( 'name' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4341:1: ( 'name' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4342:1: 'name'
            {
             before(grammarAccess.getActivityAccess().getNameKeyword_4_0()); 
            match(input,19,FOLLOW_19_in_rule__Activity__Group_4__0__Impl8635); 
             after(grammarAccess.getActivityAccess().getNameKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__0__Impl"


    // $ANTLR start "rule__Activity__Group_4__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4355:1: rule__Activity__Group_4__1 : rule__Activity__Group_4__1__Impl rule__Activity__Group_4__2 ;
    public final void rule__Activity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4359:1: ( rule__Activity__Group_4__1__Impl rule__Activity__Group_4__2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4360:2: rule__Activity__Group_4__1__Impl rule__Activity__Group_4__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_4__1__Impl_in_rule__Activity__Group_4__18666);
            rule__Activity__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_4__2_in_rule__Activity__Group_4__18669);
            rule__Activity__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__1"


    // $ANTLR start "rule__Activity__Group_4__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4367:1: rule__Activity__Group_4__1__Impl : ( ( rule__Activity__LongNameAssignment_4_1 ) ) ;
    public final void rule__Activity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4371:1: ( ( ( rule__Activity__LongNameAssignment_4_1 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4372:1: ( ( rule__Activity__LongNameAssignment_4_1 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4372:1: ( ( rule__Activity__LongNameAssignment_4_1 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4373:1: ( rule__Activity__LongNameAssignment_4_1 )
            {
             before(grammarAccess.getActivityAccess().getLongNameAssignment_4_1()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4374:1: ( rule__Activity__LongNameAssignment_4_1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4374:2: rule__Activity__LongNameAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Activity__LongNameAssignment_4_1_in_rule__Activity__Group_4__1__Impl8696);
            rule__Activity__LongNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getLongNameAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__1__Impl"


    // $ANTLR start "rule__Activity__Group_4__2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4384:1: rule__Activity__Group_4__2 : rule__Activity__Group_4__2__Impl ;
    public final void rule__Activity__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4388:1: ( rule__Activity__Group_4__2__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4389:2: rule__Activity__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_4__2__Impl_in_rule__Activity__Group_4__28726);
            rule__Activity__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__2"


    // $ANTLR start "rule__Activity__Group_4__2__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4395:1: rule__Activity__Group_4__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Activity__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4399:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4400:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4400:1: ( ruleENDLINE )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4401:1: ruleENDLINE
            {
             before(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_4_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Activity__Group_4__2__Impl8753);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__2__Impl"


    // $ANTLR start "rule__Activity__Group_5__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4418:1: rule__Activity__Group_5__0 : rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1 ;
    public final void rule__Activity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4422:1: ( rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4423:2: rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_5__0__Impl_in_rule__Activity__Group_5__08788);
            rule__Activity__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5__1_in_rule__Activity__Group_5__08791);
            rule__Activity__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__0"


    // $ANTLR start "rule__Activity__Group_5__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4430:1: rule__Activity__Group_5__0__Impl : ( 'involves' ) ;
    public final void rule__Activity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4434:1: ( ( 'involves' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4435:1: ( 'involves' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4435:1: ( 'involves' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4436:1: 'involves'
            {
             before(grammarAccess.getActivityAccess().getInvolvesKeyword_5_0()); 
            match(input,40,FOLLOW_40_in_rule__Activity__Group_5__0__Impl8819); 
             after(grammarAccess.getActivityAccess().getInvolvesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__0__Impl"


    // $ANTLR start "rule__Activity__Group_5__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4449:1: rule__Activity__Group_5__1 : rule__Activity__Group_5__1__Impl rule__Activity__Group_5__2 ;
    public final void rule__Activity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4453:1: ( rule__Activity__Group_5__1__Impl rule__Activity__Group_5__2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4454:2: rule__Activity__Group_5__1__Impl rule__Activity__Group_5__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_5__1__Impl_in_rule__Activity__Group_5__18850);
            rule__Activity__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5__2_in_rule__Activity__Group_5__18853);
            rule__Activity__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__1"


    // $ANTLR start "rule__Activity__Group_5__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4461:1: rule__Activity__Group_5__1__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__Activity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4465:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4466:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4466:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4467:1: RULE_OPENCURLY
            {
             before(grammarAccess.getActivityAccess().getOPENCURLYTerminalRuleCall_5_1()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__Activity__Group_5__1__Impl8880); 
             after(grammarAccess.getActivityAccess().getOPENCURLYTerminalRuleCall_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__1__Impl"


    // $ANTLR start "rule__Activity__Group_5__2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4478:1: rule__Activity__Group_5__2 : rule__Activity__Group_5__2__Impl rule__Activity__Group_5__3 ;
    public final void rule__Activity__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4482:1: ( rule__Activity__Group_5__2__Impl rule__Activity__Group_5__3 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4483:2: rule__Activity__Group_5__2__Impl rule__Activity__Group_5__3
            {
            pushFollow(FOLLOW_rule__Activity__Group_5__2__Impl_in_rule__Activity__Group_5__28909);
            rule__Activity__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5__3_in_rule__Activity__Group_5__28912);
            rule__Activity__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__2"


    // $ANTLR start "rule__Activity__Group_5__2__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4490:1: rule__Activity__Group_5__2__Impl : ( ( rule__Activity__InvolvedResourcesAssignment_5_2 )* ) ;
    public final void rule__Activity__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4494:1: ( ( ( rule__Activity__InvolvedResourcesAssignment_5_2 )* ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4495:1: ( ( rule__Activity__InvolvedResourcesAssignment_5_2 )* )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4495:1: ( ( rule__Activity__InvolvedResourcesAssignment_5_2 )* )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4496:1: ( rule__Activity__InvolvedResourcesAssignment_5_2 )*
            {
             before(grammarAccess.getActivityAccess().getInvolvedResourcesAssignment_5_2()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4497:1: ( rule__Activity__InvolvedResourcesAssignment_5_2 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4497:2: rule__Activity__InvolvedResourcesAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_rule__Activity__InvolvedResourcesAssignment_5_2_in_rule__Activity__Group_5__2__Impl8939);
            	    rule__Activity__InvolvedResourcesAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getInvolvedResourcesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__2__Impl"


    // $ANTLR start "rule__Activity__Group_5__3"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4507:1: rule__Activity__Group_5__3 : rule__Activity__Group_5__3__Impl ;
    public final void rule__Activity__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4511:1: ( rule__Activity__Group_5__3__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4512:2: rule__Activity__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_5__3__Impl_in_rule__Activity__Group_5__38970);
            rule__Activity__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__3"


    // $ANTLR start "rule__Activity__Group_5__3__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4518:1: rule__Activity__Group_5__3__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__Activity__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4522:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4523:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4523:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4524:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getActivityAccess().getCLOSEDCURLYTerminalRuleCall_5_3()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__Activity__Group_5__3__Impl8997); 
             after(grammarAccess.getActivityAccess().getCLOSEDCURLYTerminalRuleCall_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__3__Impl"


    // $ANTLR start "rule__Activity__Group_6_0_0__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4543:1: rule__Activity__Group_6_0_0__0 : rule__Activity__Group_6_0_0__0__Impl rule__Activity__Group_6_0_0__1 ;
    public final void rule__Activity__Group_6_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4547:1: ( rule__Activity__Group_6_0_0__0__Impl rule__Activity__Group_6_0_0__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4548:2: rule__Activity__Group_6_0_0__0__Impl rule__Activity__Group_6_0_0__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_0_0__0__Impl_in_rule__Activity__Group_6_0_0__09034);
            rule__Activity__Group_6_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_0_0__1_in_rule__Activity__Group_6_0_0__09037);
            rule__Activity__Group_6_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_0_0__0"


    // $ANTLR start "rule__Activity__Group_6_0_0__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4555:1: rule__Activity__Group_6_0_0__0__Impl : ( 'starts' ) ;
    public final void rule__Activity__Group_6_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4559:1: ( ( 'starts' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4560:1: ( 'starts' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4560:1: ( 'starts' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4561:1: 'starts'
            {
             before(grammarAccess.getActivityAccess().getStartsKeyword_6_0_0_0()); 
            match(input,41,FOLLOW_41_in_rule__Activity__Group_6_0_0__0__Impl9065); 
             after(grammarAccess.getActivityAccess().getStartsKeyword_6_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_0_0__0__Impl"


    // $ANTLR start "rule__Activity__Group_6_0_0__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4574:1: rule__Activity__Group_6_0_0__1 : rule__Activity__Group_6_0_0__1__Impl rule__Activity__Group_6_0_0__2 ;
    public final void rule__Activity__Group_6_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4578:1: ( rule__Activity__Group_6_0_0__1__Impl rule__Activity__Group_6_0_0__2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4579:2: rule__Activity__Group_6_0_0__1__Impl rule__Activity__Group_6_0_0__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_0_0__1__Impl_in_rule__Activity__Group_6_0_0__19096);
            rule__Activity__Group_6_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_0_0__2_in_rule__Activity__Group_6_0_0__19099);
            rule__Activity__Group_6_0_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_0_0__1"


    // $ANTLR start "rule__Activity__Group_6_0_0__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4586:1: rule__Activity__Group_6_0_0__1__Impl : ( ( rule__Activity__StartAssignment_6_0_0_1 ) ) ;
    public final void rule__Activity__Group_6_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4590:1: ( ( ( rule__Activity__StartAssignment_6_0_0_1 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4591:1: ( ( rule__Activity__StartAssignment_6_0_0_1 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4591:1: ( ( rule__Activity__StartAssignment_6_0_0_1 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4592:1: ( rule__Activity__StartAssignment_6_0_0_1 )
            {
             before(grammarAccess.getActivityAccess().getStartAssignment_6_0_0_1()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4593:1: ( rule__Activity__StartAssignment_6_0_0_1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4593:2: rule__Activity__StartAssignment_6_0_0_1
            {
            pushFollow(FOLLOW_rule__Activity__StartAssignment_6_0_0_1_in_rule__Activity__Group_6_0_0__1__Impl9126);
            rule__Activity__StartAssignment_6_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getStartAssignment_6_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_0_0__1__Impl"


    // $ANTLR start "rule__Activity__Group_6_0_0__2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4603:1: rule__Activity__Group_6_0_0__2 : rule__Activity__Group_6_0_0__2__Impl ;
    public final void rule__Activity__Group_6_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4607:1: ( rule__Activity__Group_6_0_0__2__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4608:2: rule__Activity__Group_6_0_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_0_0__2__Impl_in_rule__Activity__Group_6_0_0__29156);
            rule__Activity__Group_6_0_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_0_0__2"


    // $ANTLR start "rule__Activity__Group_6_0_0__2__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4614:1: rule__Activity__Group_6_0_0__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Activity__Group_6_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4618:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4619:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4619:1: ( ruleENDLINE )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4620:1: ruleENDLINE
            {
             before(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_0_0_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Activity__Group_6_0_0__2__Impl9183);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_0_0__2__Impl"


    // $ANTLR start "rule__Activity__Group_6_0_1__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4637:1: rule__Activity__Group_6_0_1__0 : rule__Activity__Group_6_0_1__0__Impl rule__Activity__Group_6_0_1__1 ;
    public final void rule__Activity__Group_6_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4641:1: ( rule__Activity__Group_6_0_1__0__Impl rule__Activity__Group_6_0_1__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4642:2: rule__Activity__Group_6_0_1__0__Impl rule__Activity__Group_6_0_1__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_0_1__0__Impl_in_rule__Activity__Group_6_0_1__09218);
            rule__Activity__Group_6_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_0_1__1_in_rule__Activity__Group_6_0_1__09221);
            rule__Activity__Group_6_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_0_1__0"


    // $ANTLR start "rule__Activity__Group_6_0_1__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4649:1: rule__Activity__Group_6_0_1__0__Impl : ( 'after' ) ;
    public final void rule__Activity__Group_6_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4653:1: ( ( 'after' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4654:1: ( 'after' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4654:1: ( 'after' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4655:1: 'after'
            {
             before(grammarAccess.getActivityAccess().getAfterKeyword_6_0_1_0()); 
            match(input,33,FOLLOW_33_in_rule__Activity__Group_6_0_1__0__Impl9249); 
             after(grammarAccess.getActivityAccess().getAfterKeyword_6_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_0_1__0__Impl"


    // $ANTLR start "rule__Activity__Group_6_0_1__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4668:1: rule__Activity__Group_6_0_1__1 : rule__Activity__Group_6_0_1__1__Impl rule__Activity__Group_6_0_1__2 ;
    public final void rule__Activity__Group_6_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4672:1: ( rule__Activity__Group_6_0_1__1__Impl rule__Activity__Group_6_0_1__2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4673:2: rule__Activity__Group_6_0_1__1__Impl rule__Activity__Group_6_0_1__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_0_1__1__Impl_in_rule__Activity__Group_6_0_1__19280);
            rule__Activity__Group_6_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_0_1__2_in_rule__Activity__Group_6_0_1__19283);
            rule__Activity__Group_6_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_0_1__1"


    // $ANTLR start "rule__Activity__Group_6_0_1__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4680:1: rule__Activity__Group_6_0_1__1__Impl : ( ( rule__Activity__AfterAssignment_6_0_1_1 ) ) ;
    public final void rule__Activity__Group_6_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4684:1: ( ( ( rule__Activity__AfterAssignment_6_0_1_1 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4685:1: ( ( rule__Activity__AfterAssignment_6_0_1_1 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4685:1: ( ( rule__Activity__AfterAssignment_6_0_1_1 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4686:1: ( rule__Activity__AfterAssignment_6_0_1_1 )
            {
             before(grammarAccess.getActivityAccess().getAfterAssignment_6_0_1_1()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4687:1: ( rule__Activity__AfterAssignment_6_0_1_1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4687:2: rule__Activity__AfterAssignment_6_0_1_1
            {
            pushFollow(FOLLOW_rule__Activity__AfterAssignment_6_0_1_1_in_rule__Activity__Group_6_0_1__1__Impl9310);
            rule__Activity__AfterAssignment_6_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getAfterAssignment_6_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_0_1__1__Impl"


    // $ANTLR start "rule__Activity__Group_6_0_1__2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4697:1: rule__Activity__Group_6_0_1__2 : rule__Activity__Group_6_0_1__2__Impl rule__Activity__Group_6_0_1__3 ;
    public final void rule__Activity__Group_6_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4701:1: ( rule__Activity__Group_6_0_1__2__Impl rule__Activity__Group_6_0_1__3 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4702:2: rule__Activity__Group_6_0_1__2__Impl rule__Activity__Group_6_0_1__3
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_0_1__2__Impl_in_rule__Activity__Group_6_0_1__29340);
            rule__Activity__Group_6_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_0_1__3_in_rule__Activity__Group_6_0_1__29343);
            rule__Activity__Group_6_0_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_0_1__2"


    // $ANTLR start "rule__Activity__Group_6_0_1__2__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4709:1: rule__Activity__Group_6_0_1__2__Impl : ( 'offset' ) ;
    public final void rule__Activity__Group_6_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4713:1: ( ( 'offset' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4714:1: ( 'offset' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4714:1: ( 'offset' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4715:1: 'offset'
            {
             before(grammarAccess.getActivityAccess().getOffsetKeyword_6_0_1_2()); 
            match(input,34,FOLLOW_34_in_rule__Activity__Group_6_0_1__2__Impl9371); 
             after(grammarAccess.getActivityAccess().getOffsetKeyword_6_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_0_1__2__Impl"


    // $ANTLR start "rule__Activity__Group_6_0_1__3"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4728:1: rule__Activity__Group_6_0_1__3 : rule__Activity__Group_6_0_1__3__Impl rule__Activity__Group_6_0_1__4 ;
    public final void rule__Activity__Group_6_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4732:1: ( rule__Activity__Group_6_0_1__3__Impl rule__Activity__Group_6_0_1__4 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4733:2: rule__Activity__Group_6_0_1__3__Impl rule__Activity__Group_6_0_1__4
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_0_1__3__Impl_in_rule__Activity__Group_6_0_1__39402);
            rule__Activity__Group_6_0_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_0_1__4_in_rule__Activity__Group_6_0_1__39405);
            rule__Activity__Group_6_0_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_0_1__3"


    // $ANTLR start "rule__Activity__Group_6_0_1__3__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4740:1: rule__Activity__Group_6_0_1__3__Impl : ( ( rule__Activity__OffsetAssignment_6_0_1_3 ) ) ;
    public final void rule__Activity__Group_6_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4744:1: ( ( ( rule__Activity__OffsetAssignment_6_0_1_3 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4745:1: ( ( rule__Activity__OffsetAssignment_6_0_1_3 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4745:1: ( ( rule__Activity__OffsetAssignment_6_0_1_3 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4746:1: ( rule__Activity__OffsetAssignment_6_0_1_3 )
            {
             before(grammarAccess.getActivityAccess().getOffsetAssignment_6_0_1_3()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4747:1: ( rule__Activity__OffsetAssignment_6_0_1_3 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4747:2: rule__Activity__OffsetAssignment_6_0_1_3
            {
            pushFollow(FOLLOW_rule__Activity__OffsetAssignment_6_0_1_3_in_rule__Activity__Group_6_0_1__3__Impl9432);
            rule__Activity__OffsetAssignment_6_0_1_3();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getOffsetAssignment_6_0_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_0_1__3__Impl"


    // $ANTLR start "rule__Activity__Group_6_0_1__4"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4757:1: rule__Activity__Group_6_0_1__4 : rule__Activity__Group_6_0_1__4__Impl ;
    public final void rule__Activity__Group_6_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4761:1: ( rule__Activity__Group_6_0_1__4__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4762:2: rule__Activity__Group_6_0_1__4__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_0_1__4__Impl_in_rule__Activity__Group_6_0_1__49462);
            rule__Activity__Group_6_0_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_0_1__4"


    // $ANTLR start "rule__Activity__Group_6_0_1__4__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4768:1: rule__Activity__Group_6_0_1__4__Impl : ( ruleENDLINE ) ;
    public final void rule__Activity__Group_6_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4772:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4773:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4773:1: ( ruleENDLINE )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4774:1: ruleENDLINE
            {
             before(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_0_1_4()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Activity__Group_6_0_1__4__Impl9489);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_0_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_0_1__4__Impl"


    // $ANTLR start "rule__Activity__Group_6_1__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4795:1: rule__Activity__Group_6_1__0 : rule__Activity__Group_6_1__0__Impl rule__Activity__Group_6_1__1 ;
    public final void rule__Activity__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4799:1: ( rule__Activity__Group_6_1__0__Impl rule__Activity__Group_6_1__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4800:2: rule__Activity__Group_6_1__0__Impl rule__Activity__Group_6_1__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_1__0__Impl_in_rule__Activity__Group_6_1__09528);
            rule__Activity__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_1__1_in_rule__Activity__Group_6_1__09531);
            rule__Activity__Group_6_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_1__0"


    // $ANTLR start "rule__Activity__Group_6_1__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4807:1: rule__Activity__Group_6_1__0__Impl : ( ( rule__Activity__Alternatives_6_1_0 ) ) ;
    public final void rule__Activity__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4811:1: ( ( ( rule__Activity__Alternatives_6_1_0 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4812:1: ( ( rule__Activity__Alternatives_6_1_0 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4812:1: ( ( rule__Activity__Alternatives_6_1_0 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4813:1: ( rule__Activity__Alternatives_6_1_0 )
            {
             before(grammarAccess.getActivityAccess().getAlternatives_6_1_0()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4814:1: ( rule__Activity__Alternatives_6_1_0 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4814:2: rule__Activity__Alternatives_6_1_0
            {
            pushFollow(FOLLOW_rule__Activity__Alternatives_6_1_0_in_rule__Activity__Group_6_1__0__Impl9558);
            rule__Activity__Alternatives_6_1_0();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getAlternatives_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_1__0__Impl"


    // $ANTLR start "rule__Activity__Group_6_1__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4824:1: rule__Activity__Group_6_1__1 : rule__Activity__Group_6_1__1__Impl rule__Activity__Group_6_1__2 ;
    public final void rule__Activity__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4828:1: ( rule__Activity__Group_6_1__1__Impl rule__Activity__Group_6_1__2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4829:2: rule__Activity__Group_6_1__1__Impl rule__Activity__Group_6_1__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_1__1__Impl_in_rule__Activity__Group_6_1__19588);
            rule__Activity__Group_6_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_1__2_in_rule__Activity__Group_6_1__19591);
            rule__Activity__Group_6_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_1__1"


    // $ANTLR start "rule__Activity__Group_6_1__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4836:1: rule__Activity__Group_6_1__1__Impl : ( 'completeness' ) ;
    public final void rule__Activity__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4840:1: ( ( 'completeness' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4841:1: ( 'completeness' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4841:1: ( 'completeness' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4842:1: 'completeness'
            {
             before(grammarAccess.getActivityAccess().getCompletenessKeyword_6_1_1()); 
            match(input,35,FOLLOW_35_in_rule__Activity__Group_6_1__1__Impl9619); 
             after(grammarAccess.getActivityAccess().getCompletenessKeyword_6_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_1__1__Impl"


    // $ANTLR start "rule__Activity__Group_6_1__2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4855:1: rule__Activity__Group_6_1__2 : rule__Activity__Group_6_1__2__Impl rule__Activity__Group_6_1__3 ;
    public final void rule__Activity__Group_6_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4859:1: ( rule__Activity__Group_6_1__2__Impl rule__Activity__Group_6_1__3 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4860:2: rule__Activity__Group_6_1__2__Impl rule__Activity__Group_6_1__3
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_1__2__Impl_in_rule__Activity__Group_6_1__29650);
            rule__Activity__Group_6_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_1__3_in_rule__Activity__Group_6_1__29653);
            rule__Activity__Group_6_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_1__2"


    // $ANTLR start "rule__Activity__Group_6_1__2__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4867:1: rule__Activity__Group_6_1__2__Impl : ( ( rule__Activity__CompletenessAssignment_6_1_2 ) ) ;
    public final void rule__Activity__Group_6_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4871:1: ( ( ( rule__Activity__CompletenessAssignment_6_1_2 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4872:1: ( ( rule__Activity__CompletenessAssignment_6_1_2 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4872:1: ( ( rule__Activity__CompletenessAssignment_6_1_2 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4873:1: ( rule__Activity__CompletenessAssignment_6_1_2 )
            {
             before(grammarAccess.getActivityAccess().getCompletenessAssignment_6_1_2()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4874:1: ( rule__Activity__CompletenessAssignment_6_1_2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4874:2: rule__Activity__CompletenessAssignment_6_1_2
            {
            pushFollow(FOLLOW_rule__Activity__CompletenessAssignment_6_1_2_in_rule__Activity__Group_6_1__2__Impl9680);
            rule__Activity__CompletenessAssignment_6_1_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getCompletenessAssignment_6_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_1__2__Impl"


    // $ANTLR start "rule__Activity__Group_6_1__3"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4884:1: rule__Activity__Group_6_1__3 : rule__Activity__Group_6_1__3__Impl rule__Activity__Group_6_1__4 ;
    public final void rule__Activity__Group_6_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4888:1: ( rule__Activity__Group_6_1__3__Impl rule__Activity__Group_6_1__4 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4889:2: rule__Activity__Group_6_1__3__Impl rule__Activity__Group_6_1__4
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_1__3__Impl_in_rule__Activity__Group_6_1__39710);
            rule__Activity__Group_6_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_1__4_in_rule__Activity__Group_6_1__39713);
            rule__Activity__Group_6_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_1__3"


    // $ANTLR start "rule__Activity__Group_6_1__3__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4896:1: rule__Activity__Group_6_1__3__Impl : ( '%' ) ;
    public final void rule__Activity__Group_6_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4900:1: ( ( '%' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4901:1: ( '%' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4901:1: ( '%' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4902:1: '%'
            {
             before(grammarAccess.getActivityAccess().getPercentSignKeyword_6_1_3()); 
            match(input,36,FOLLOW_36_in_rule__Activity__Group_6_1__3__Impl9741); 
             after(grammarAccess.getActivityAccess().getPercentSignKeyword_6_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_1__3__Impl"


    // $ANTLR start "rule__Activity__Group_6_1__4"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4915:1: rule__Activity__Group_6_1__4 : rule__Activity__Group_6_1__4__Impl ;
    public final void rule__Activity__Group_6_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4919:1: ( rule__Activity__Group_6_1__4__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4920:2: rule__Activity__Group_6_1__4__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_1__4__Impl_in_rule__Activity__Group_6_1__49772);
            rule__Activity__Group_6_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_1__4"


    // $ANTLR start "rule__Activity__Group_6_1__4__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4926:1: rule__Activity__Group_6_1__4__Impl : ( ruleENDLINE ) ;
    public final void rule__Activity__Group_6_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4930:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4931:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4931:1: ( ruleENDLINE )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4932:1: ruleENDLINE
            {
             before(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_1_4()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Activity__Group_6_1__4__Impl9799);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_1__4__Impl"


    // $ANTLR start "rule__Activity__Group_6_1_0_0__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4953:1: rule__Activity__Group_6_1_0_0__0 : rule__Activity__Group_6_1_0_0__0__Impl rule__Activity__Group_6_1_0_0__1 ;
    public final void rule__Activity__Group_6_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4957:1: ( rule__Activity__Group_6_1_0_0__0__Impl rule__Activity__Group_6_1_0_0__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4958:2: rule__Activity__Group_6_1_0_0__0__Impl rule__Activity__Group_6_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_1_0_0__0__Impl_in_rule__Activity__Group_6_1_0_0__09838);
            rule__Activity__Group_6_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_1_0_0__1_in_rule__Activity__Group_6_1_0_0__09841);
            rule__Activity__Group_6_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_1_0_0__0"


    // $ANTLR start "rule__Activity__Group_6_1_0_0__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4965:1: rule__Activity__Group_6_1_0_0__0__Impl : ( 'ends' ) ;
    public final void rule__Activity__Group_6_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4969:1: ( ( 'ends' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4970:1: ( 'ends' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4970:1: ( 'ends' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4971:1: 'ends'
            {
             before(grammarAccess.getActivityAccess().getEndsKeyword_6_1_0_0_0()); 
            match(input,42,FOLLOW_42_in_rule__Activity__Group_6_1_0_0__0__Impl9869); 
             after(grammarAccess.getActivityAccess().getEndsKeyword_6_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_1_0_0__0__Impl"


    // $ANTLR start "rule__Activity__Group_6_1_0_0__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4984:1: rule__Activity__Group_6_1_0_0__1 : rule__Activity__Group_6_1_0_0__1__Impl rule__Activity__Group_6_1_0_0__2 ;
    public final void rule__Activity__Group_6_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4988:1: ( rule__Activity__Group_6_1_0_0__1__Impl rule__Activity__Group_6_1_0_0__2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4989:2: rule__Activity__Group_6_1_0_0__1__Impl rule__Activity__Group_6_1_0_0__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_1_0_0__1__Impl_in_rule__Activity__Group_6_1_0_0__19900);
            rule__Activity__Group_6_1_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_1_0_0__2_in_rule__Activity__Group_6_1_0_0__19903);
            rule__Activity__Group_6_1_0_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_1_0_0__1"


    // $ANTLR start "rule__Activity__Group_6_1_0_0__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4996:1: rule__Activity__Group_6_1_0_0__1__Impl : ( ( rule__Activity__EndAssignment_6_1_0_0_1 ) ) ;
    public final void rule__Activity__Group_6_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5000:1: ( ( ( rule__Activity__EndAssignment_6_1_0_0_1 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5001:1: ( ( rule__Activity__EndAssignment_6_1_0_0_1 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5001:1: ( ( rule__Activity__EndAssignment_6_1_0_0_1 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5002:1: ( rule__Activity__EndAssignment_6_1_0_0_1 )
            {
             before(grammarAccess.getActivityAccess().getEndAssignment_6_1_0_0_1()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5003:1: ( rule__Activity__EndAssignment_6_1_0_0_1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5003:2: rule__Activity__EndAssignment_6_1_0_0_1
            {
            pushFollow(FOLLOW_rule__Activity__EndAssignment_6_1_0_0_1_in_rule__Activity__Group_6_1_0_0__1__Impl9930);
            rule__Activity__EndAssignment_6_1_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getEndAssignment_6_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_1_0_0__1__Impl"


    // $ANTLR start "rule__Activity__Group_6_1_0_0__2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5013:1: rule__Activity__Group_6_1_0_0__2 : rule__Activity__Group_6_1_0_0__2__Impl ;
    public final void rule__Activity__Group_6_1_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5017:1: ( rule__Activity__Group_6_1_0_0__2__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5018:2: rule__Activity__Group_6_1_0_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_1_0_0__2__Impl_in_rule__Activity__Group_6_1_0_0__29960);
            rule__Activity__Group_6_1_0_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_1_0_0__2"


    // $ANTLR start "rule__Activity__Group_6_1_0_0__2__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5024:1: rule__Activity__Group_6_1_0_0__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Activity__Group_6_1_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5028:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5029:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5029:1: ( ruleENDLINE )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5030:1: ruleENDLINE
            {
             before(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_1_0_0_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Activity__Group_6_1_0_0__2__Impl9987);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_1_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_1_0_0__2__Impl"


    // $ANTLR start "rule__Activity__Group_6_1_0_1__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5047:1: rule__Activity__Group_6_1_0_1__0 : rule__Activity__Group_6_1_0_1__0__Impl rule__Activity__Group_6_1_0_1__1 ;
    public final void rule__Activity__Group_6_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5051:1: ( rule__Activity__Group_6_1_0_1__0__Impl rule__Activity__Group_6_1_0_1__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5052:2: rule__Activity__Group_6_1_0_1__0__Impl rule__Activity__Group_6_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_1_0_1__0__Impl_in_rule__Activity__Group_6_1_0_1__010022);
            rule__Activity__Group_6_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_1_0_1__1_in_rule__Activity__Group_6_1_0_1__010025);
            rule__Activity__Group_6_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_1_0_1__0"


    // $ANTLR start "rule__Activity__Group_6_1_0_1__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5059:1: rule__Activity__Group_6_1_0_1__0__Impl : ( 'duration' ) ;
    public final void rule__Activity__Group_6_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5063:1: ( ( 'duration' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5064:1: ( 'duration' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5064:1: ( 'duration' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5065:1: 'duration'
            {
             before(grammarAccess.getActivityAccess().getDurationKeyword_6_1_0_1_0()); 
            match(input,43,FOLLOW_43_in_rule__Activity__Group_6_1_0_1__0__Impl10053); 
             after(grammarAccess.getActivityAccess().getDurationKeyword_6_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_1_0_1__0__Impl"


    // $ANTLR start "rule__Activity__Group_6_1_0_1__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5078:1: rule__Activity__Group_6_1_0_1__1 : rule__Activity__Group_6_1_0_1__1__Impl rule__Activity__Group_6_1_0_1__2 ;
    public final void rule__Activity__Group_6_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5082:1: ( rule__Activity__Group_6_1_0_1__1__Impl rule__Activity__Group_6_1_0_1__2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5083:2: rule__Activity__Group_6_1_0_1__1__Impl rule__Activity__Group_6_1_0_1__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_1_0_1__1__Impl_in_rule__Activity__Group_6_1_0_1__110084);
            rule__Activity__Group_6_1_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_1_0_1__2_in_rule__Activity__Group_6_1_0_1__110087);
            rule__Activity__Group_6_1_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_1_0_1__1"


    // $ANTLR start "rule__Activity__Group_6_1_0_1__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5090:1: rule__Activity__Group_6_1_0_1__1__Impl : ( ( rule__Activity__DurationAssignment_6_1_0_1_1 ) ) ;
    public final void rule__Activity__Group_6_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5094:1: ( ( ( rule__Activity__DurationAssignment_6_1_0_1_1 ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5095:1: ( ( rule__Activity__DurationAssignment_6_1_0_1_1 ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5095:1: ( ( rule__Activity__DurationAssignment_6_1_0_1_1 ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5096:1: ( rule__Activity__DurationAssignment_6_1_0_1_1 )
            {
             before(grammarAccess.getActivityAccess().getDurationAssignment_6_1_0_1_1()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5097:1: ( rule__Activity__DurationAssignment_6_1_0_1_1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5097:2: rule__Activity__DurationAssignment_6_1_0_1_1
            {
            pushFollow(FOLLOW_rule__Activity__DurationAssignment_6_1_0_1_1_in_rule__Activity__Group_6_1_0_1__1__Impl10114);
            rule__Activity__DurationAssignment_6_1_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getDurationAssignment_6_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_1_0_1__1__Impl"


    // $ANTLR start "rule__Activity__Group_6_1_0_1__2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5107:1: rule__Activity__Group_6_1_0_1__2 : rule__Activity__Group_6_1_0_1__2__Impl ;
    public final void rule__Activity__Group_6_1_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5111:1: ( rule__Activity__Group_6_1_0_1__2__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5112:2: rule__Activity__Group_6_1_0_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_1_0_1__2__Impl_in_rule__Activity__Group_6_1_0_1__210144);
            rule__Activity__Group_6_1_0_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_1_0_1__2"


    // $ANTLR start "rule__Activity__Group_6_1_0_1__2__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5118:1: rule__Activity__Group_6_1_0_1__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Activity__Group_6_1_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5122:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5123:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5123:1: ( ruleENDLINE )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5124:1: ruleENDLINE
            {
             before(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_1_0_1_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Activity__Group_6_1_0_1__2__Impl10171);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_1_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_1_0_1__2__Impl"


    // $ANTLR start "rule__Activity__Group_6_2__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5141:1: rule__Activity__Group_6_2__0 : rule__Activity__Group_6_2__0__Impl rule__Activity__Group_6_2__1 ;
    public final void rule__Activity__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5145:1: ( rule__Activity__Group_6_2__0__Impl rule__Activity__Group_6_2__1 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5146:2: rule__Activity__Group_6_2__0__Impl rule__Activity__Group_6_2__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_2__0__Impl_in_rule__Activity__Group_6_2__010206);
            rule__Activity__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_2__1_in_rule__Activity__Group_6_2__010209);
            rule__Activity__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_2__0"


    // $ANTLR start "rule__Activity__Group_6_2__0__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5153:1: rule__Activity__Group_6_2__0__Impl : ( 'dependsOn' ) ;
    public final void rule__Activity__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5157:1: ( ( 'dependsOn' ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5158:1: ( 'dependsOn' )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5158:1: ( 'dependsOn' )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5159:1: 'dependsOn'
            {
             before(grammarAccess.getActivityAccess().getDependsOnKeyword_6_2_0()); 
            match(input,26,FOLLOW_26_in_rule__Activity__Group_6_2__0__Impl10237); 
             after(grammarAccess.getActivityAccess().getDependsOnKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_2__0__Impl"


    // $ANTLR start "rule__Activity__Group_6_2__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5172:1: rule__Activity__Group_6_2__1 : rule__Activity__Group_6_2__1__Impl rule__Activity__Group_6_2__2 ;
    public final void rule__Activity__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5176:1: ( rule__Activity__Group_6_2__1__Impl rule__Activity__Group_6_2__2 )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5177:2: rule__Activity__Group_6_2__1__Impl rule__Activity__Group_6_2__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_2__1__Impl_in_rule__Activity__Group_6_2__110268);
            rule__Activity__Group_6_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_2__2_in_rule__Activity__Group_6_2__110271);
            rule__Activity__Group_6_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_2__1"


    // $ANTLR start "rule__Activity__Group_6_2__1__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5184:1: rule__Activity__Group_6_2__1__Impl : ( ( rule__Activity__DependenciesAssignment_6_2_1 )* ) ;
    public final void rule__Activity__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5188:1: ( ( ( rule__Activity__DependenciesAssignment_6_2_1 )* ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5189:1: ( ( rule__Activity__DependenciesAssignment_6_2_1 )* )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5189:1: ( ( rule__Activity__DependenciesAssignment_6_2_1 )* )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5190:1: ( rule__Activity__DependenciesAssignment_6_2_1 )*
            {
             before(grammarAccess.getActivityAccess().getDependenciesAssignment_6_2_1()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5191:1: ( rule__Activity__DependenciesAssignment_6_2_1 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5191:2: rule__Activity__DependenciesAssignment_6_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Activity__DependenciesAssignment_6_2_1_in_rule__Activity__Group_6_2__1__Impl10298);
            	    rule__Activity__DependenciesAssignment_6_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getDependenciesAssignment_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_2__1__Impl"


    // $ANTLR start "rule__Activity__Group_6_2__2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5201:1: rule__Activity__Group_6_2__2 : rule__Activity__Group_6_2__2__Impl ;
    public final void rule__Activity__Group_6_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5205:1: ( rule__Activity__Group_6_2__2__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5206:2: rule__Activity__Group_6_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_2__2__Impl_in_rule__Activity__Group_6_2__210329);
            rule__Activity__Group_6_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_2__2"


    // $ANTLR start "rule__Activity__Group_6_2__2__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5212:1: rule__Activity__Group_6_2__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Activity__Group_6_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5216:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5217:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5217:1: ( ruleENDLINE )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5218:1: ruleENDLINE
            {
             before(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_2_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Activity__Group_6_2__2__Impl10356);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_2__2__Impl"


    // $ANTLR start "rule__CheckPoint__UnorderedGroup_5"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5237:1: rule__CheckPoint__UnorderedGroup_5 : rule__CheckPoint__UnorderedGroup_5__0 {...}?;
    public final void rule__CheckPoint__UnorderedGroup_5() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getCheckPointAccess().getUnorderedGroup_5());
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5242:1: ( rule__CheckPoint__UnorderedGroup_5__0 {...}?)
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5243:2: rule__CheckPoint__UnorderedGroup_5__0 {...}?
            {
            pushFollow(FOLLOW_rule__CheckPoint__UnorderedGroup_5__0_in_rule__CheckPoint__UnorderedGroup_510393);
            rule__CheckPoint__UnorderedGroup_5__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getCheckPointAccess().getUnorderedGroup_5()) ) {
                throw new FailedPredicateException(input, "rule__CheckPoint__UnorderedGroup_5", "getUnorderedGroupHelper().canLeave(grammarAccess.getCheckPointAccess().getUnorderedGroup_5())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getCheckPointAccess().getUnorderedGroup_5());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__UnorderedGroup_5"


    // $ANTLR start "rule__CheckPoint__UnorderedGroup_5__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5254:1: rule__CheckPoint__UnorderedGroup_5__Impl : ( ({...}? => ( ( ( rule__CheckPoint__Alternatives_5_0 ) ) ) ) | ({...}? => ( ( ( rule__CheckPoint__Group_5_1__0 ) ) ) ) ) ;
    public final void rule__CheckPoint__UnorderedGroup_5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5259:1: ( ( ({...}? => ( ( ( rule__CheckPoint__Alternatives_5_0 ) ) ) ) | ({...}? => ( ( ( rule__CheckPoint__Group_5_1__0 ) ) ) ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5260:3: ( ({...}? => ( ( ( rule__CheckPoint__Alternatives_5_0 ) ) ) ) | ({...}? => ( ( ( rule__CheckPoint__Group_5_1__0 ) ) ) ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5260:3: ( ({...}? => ( ( ( rule__CheckPoint__Alternatives_5_0 ) ) ) ) | ({...}? => ( ( ( rule__CheckPoint__Group_5_1__0 ) ) ) ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( LA39_0 >=32 && LA39_0<=33 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 0) ) {
                alt39=1;
            }
            else if ( LA39_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 1) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5262:4: ({...}? => ( ( ( rule__CheckPoint__Alternatives_5_0 ) ) ) )
                    {
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5262:4: ({...}? => ( ( ( rule__CheckPoint__Alternatives_5_0 ) ) ) )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5263:5: {...}? => ( ( ( rule__CheckPoint__Alternatives_5_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 0) ) {
                        throw new FailedPredicateException(input, "rule__CheckPoint__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 0)");
                    }
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5263:107: ( ( ( rule__CheckPoint__Alternatives_5_0 ) ) )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5264:6: ( ( rule__CheckPoint__Alternatives_5_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5270:6: ( ( rule__CheckPoint__Alternatives_5_0 ) )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5272:7: ( rule__CheckPoint__Alternatives_5_0 )
                    {
                     before(grammarAccess.getCheckPointAccess().getAlternatives_5_0()); 
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5273:7: ( rule__CheckPoint__Alternatives_5_0 )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5273:8: rule__CheckPoint__Alternatives_5_0
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__Alternatives_5_0_in_rule__CheckPoint__UnorderedGroup_5__Impl10482);
                    rule__CheckPoint__Alternatives_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCheckPointAccess().getAlternatives_5_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5279:4: ({...}? => ( ( ( rule__CheckPoint__Group_5_1__0 ) ) ) )
                    {
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5279:4: ({...}? => ( ( ( rule__CheckPoint__Group_5_1__0 ) ) ) )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5280:5: {...}? => ( ( ( rule__CheckPoint__Group_5_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 1) ) {
                        throw new FailedPredicateException(input, "rule__CheckPoint__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 1)");
                    }
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5280:107: ( ( ( rule__CheckPoint__Group_5_1__0 ) ) )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5281:6: ( ( rule__CheckPoint__Group_5_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5287:6: ( ( rule__CheckPoint__Group_5_1__0 ) )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5289:7: ( rule__CheckPoint__Group_5_1__0 )
                    {
                     before(grammarAccess.getCheckPointAccess().getGroup_5_1()); 
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5290:7: ( rule__CheckPoint__Group_5_1__0 )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5290:8: rule__CheckPoint__Group_5_1__0
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__Group_5_1__0_in_rule__CheckPoint__UnorderedGroup_5__Impl10573);
                    rule__CheckPoint__Group_5_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCheckPointAccess().getGroup_5_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCheckPointAccess().getUnorderedGroup_5());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__UnorderedGroup_5__Impl"


    // $ANTLR start "rule__CheckPoint__UnorderedGroup_5__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5305:1: rule__CheckPoint__UnorderedGroup_5__0 : rule__CheckPoint__UnorderedGroup_5__Impl ( rule__CheckPoint__UnorderedGroup_5__1 )? ;
    public final void rule__CheckPoint__UnorderedGroup_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5309:1: ( rule__CheckPoint__UnorderedGroup_5__Impl ( rule__CheckPoint__UnorderedGroup_5__1 )? )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5310:2: rule__CheckPoint__UnorderedGroup_5__Impl ( rule__CheckPoint__UnorderedGroup_5__1 )?
            {
            pushFollow(FOLLOW_rule__CheckPoint__UnorderedGroup_5__Impl_in_rule__CheckPoint__UnorderedGroup_5__010632);
            rule__CheckPoint__UnorderedGroup_5__Impl();

            state._fsp--;

            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5311:2: ( rule__CheckPoint__UnorderedGroup_5__1 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( LA40_0 >=32 && LA40_0<=33 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 0) ) {
                alt40=1;
            }
            else if ( LA40_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 1) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5311:2: rule__CheckPoint__UnorderedGroup_5__1
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__UnorderedGroup_5__1_in_rule__CheckPoint__UnorderedGroup_5__010635);
                    rule__CheckPoint__UnorderedGroup_5__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__UnorderedGroup_5__0"


    // $ANTLR start "rule__CheckPoint__UnorderedGroup_5__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5318:1: rule__CheckPoint__UnorderedGroup_5__1 : rule__CheckPoint__UnorderedGroup_5__Impl ;
    public final void rule__CheckPoint__UnorderedGroup_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5322:1: ( rule__CheckPoint__UnorderedGroup_5__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5323:2: rule__CheckPoint__UnorderedGroup_5__Impl
            {
            pushFollow(FOLLOW_rule__CheckPoint__UnorderedGroup_5__Impl_in_rule__CheckPoint__UnorderedGroup_5__110660);
            rule__CheckPoint__UnorderedGroup_5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__UnorderedGroup_5__1"


    // $ANTLR start "rule__Activity__UnorderedGroup_6"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5334:1: rule__Activity__UnorderedGroup_6 : rule__Activity__UnorderedGroup_6__0 {...}?;
    public final void rule__Activity__UnorderedGroup_6() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getActivityAccess().getUnorderedGroup_6());
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5339:1: ( rule__Activity__UnorderedGroup_6__0 {...}?)
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5340:2: rule__Activity__UnorderedGroup_6__0 {...}?
            {
            pushFollow(FOLLOW_rule__Activity__UnorderedGroup_6__0_in_rule__Activity__UnorderedGroup_610688);
            rule__Activity__UnorderedGroup_6__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getActivityAccess().getUnorderedGroup_6()) ) {
                throw new FailedPredicateException(input, "rule__Activity__UnorderedGroup_6", "getUnorderedGroupHelper().canLeave(grammarAccess.getActivityAccess().getUnorderedGroup_6())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getActivityAccess().getUnorderedGroup_6());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__UnorderedGroup_6"


    // $ANTLR start "rule__Activity__UnorderedGroup_6__Impl"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5351:1: rule__Activity__UnorderedGroup_6__Impl : ( ({...}? => ( ( ( rule__Activity__Alternatives_6_0 ) ) ) ) | ({...}? => ( ( ( rule__Activity__Group_6_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Activity__Group_6_2__0 ) ) ) ) ) ;
    public final void rule__Activity__UnorderedGroup_6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5356:1: ( ( ({...}? => ( ( ( rule__Activity__Alternatives_6_0 ) ) ) ) | ({...}? => ( ( ( rule__Activity__Group_6_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Activity__Group_6_2__0 ) ) ) ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5357:3: ( ({...}? => ( ( ( rule__Activity__Alternatives_6_0 ) ) ) ) | ({...}? => ( ( ( rule__Activity__Group_6_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Activity__Group_6_2__0 ) ) ) ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5357:3: ( ({...}? => ( ( ( rule__Activity__Alternatives_6_0 ) ) ) ) | ({...}? => ( ( ( rule__Activity__Group_6_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Activity__Group_6_2__0 ) ) ) ) )
            int alt41=3;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==33||LA41_0==41) && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 0) ) {
                alt41=1;
            }
            else if ( LA41_0 >=42 && LA41_0<=43 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 1) ) {
                alt41=2;
            }
            else if ( LA41_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 2) ) {
                alt41=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5359:4: ({...}? => ( ( ( rule__Activity__Alternatives_6_0 ) ) ) )
                    {
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5359:4: ({...}? => ( ( ( rule__Activity__Alternatives_6_0 ) ) ) )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5360:5: {...}? => ( ( ( rule__Activity__Alternatives_6_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Activity__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 0)");
                    }
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5360:105: ( ( ( rule__Activity__Alternatives_6_0 ) ) )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5361:6: ( ( rule__Activity__Alternatives_6_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5367:6: ( ( rule__Activity__Alternatives_6_0 ) )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5369:7: ( rule__Activity__Alternatives_6_0 )
                    {
                     before(grammarAccess.getActivityAccess().getAlternatives_6_0()); 
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5370:7: ( rule__Activity__Alternatives_6_0 )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5370:8: rule__Activity__Alternatives_6_0
                    {
                    pushFollow(FOLLOW_rule__Activity__Alternatives_6_0_in_rule__Activity__UnorderedGroup_6__Impl10777);
                    rule__Activity__Alternatives_6_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getAlternatives_6_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5376:4: ({...}? => ( ( ( rule__Activity__Group_6_1__0 ) ) ) )
                    {
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5376:4: ({...}? => ( ( ( rule__Activity__Group_6_1__0 ) ) ) )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5377:5: {...}? => ( ( ( rule__Activity__Group_6_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Activity__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 1)");
                    }
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5377:105: ( ( ( rule__Activity__Group_6_1__0 ) ) )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5378:6: ( ( rule__Activity__Group_6_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5384:6: ( ( rule__Activity__Group_6_1__0 ) )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5386:7: ( rule__Activity__Group_6_1__0 )
                    {
                     before(grammarAccess.getActivityAccess().getGroup_6_1()); 
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5387:7: ( rule__Activity__Group_6_1__0 )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5387:8: rule__Activity__Group_6_1__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_6_1__0_in_rule__Activity__UnorderedGroup_6__Impl10868);
                    rule__Activity__Group_6_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getGroup_6_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5393:4: ({...}? => ( ( ( rule__Activity__Group_6_2__0 ) ) ) )
                    {
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5393:4: ({...}? => ( ( ( rule__Activity__Group_6_2__0 ) ) ) )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5394:5: {...}? => ( ( ( rule__Activity__Group_6_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Activity__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 2)");
                    }
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5394:105: ( ( ( rule__Activity__Group_6_2__0 ) ) )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5395:6: ( ( rule__Activity__Group_6_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5401:6: ( ( rule__Activity__Group_6_2__0 ) )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5403:7: ( rule__Activity__Group_6_2__0 )
                    {
                     before(grammarAccess.getActivityAccess().getGroup_6_2()); 
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5404:7: ( rule__Activity__Group_6_2__0 )
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5404:8: rule__Activity__Group_6_2__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_6_2__0_in_rule__Activity__UnorderedGroup_6__Impl10959);
                    rule__Activity__Group_6_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getGroup_6_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivityAccess().getUnorderedGroup_6());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__UnorderedGroup_6__Impl"


    // $ANTLR start "rule__Activity__UnorderedGroup_6__0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5419:1: rule__Activity__UnorderedGroup_6__0 : rule__Activity__UnorderedGroup_6__Impl ( rule__Activity__UnorderedGroup_6__1 )? ;
    public final void rule__Activity__UnorderedGroup_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5423:1: ( rule__Activity__UnorderedGroup_6__Impl ( rule__Activity__UnorderedGroup_6__1 )? )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5424:2: rule__Activity__UnorderedGroup_6__Impl ( rule__Activity__UnorderedGroup_6__1 )?
            {
            pushFollow(FOLLOW_rule__Activity__UnorderedGroup_6__Impl_in_rule__Activity__UnorderedGroup_6__011018);
            rule__Activity__UnorderedGroup_6__Impl();

            state._fsp--;

            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5425:2: ( rule__Activity__UnorderedGroup_6__1 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==33||LA42_0==41) && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 0) ) {
                alt42=1;
            }
            else if ( LA42_0 >=42 && LA42_0<=43 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 1) ) {
                alt42=1;
            }
            else if ( LA42_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 2) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5425:2: rule__Activity__UnorderedGroup_6__1
                    {
                    pushFollow(FOLLOW_rule__Activity__UnorderedGroup_6__1_in_rule__Activity__UnorderedGroup_6__011021);
                    rule__Activity__UnorderedGroup_6__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__UnorderedGroup_6__0"


    // $ANTLR start "rule__Activity__UnorderedGroup_6__1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5432:1: rule__Activity__UnorderedGroup_6__1 : rule__Activity__UnorderedGroup_6__Impl ( rule__Activity__UnorderedGroup_6__2 )? ;
    public final void rule__Activity__UnorderedGroup_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5436:1: ( rule__Activity__UnorderedGroup_6__Impl ( rule__Activity__UnorderedGroup_6__2 )? )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5437:2: rule__Activity__UnorderedGroup_6__Impl ( rule__Activity__UnorderedGroup_6__2 )?
            {
            pushFollow(FOLLOW_rule__Activity__UnorderedGroup_6__Impl_in_rule__Activity__UnorderedGroup_6__111046);
            rule__Activity__UnorderedGroup_6__Impl();

            state._fsp--;

            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5438:2: ( rule__Activity__UnorderedGroup_6__2 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==33||LA43_0==41) && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 0) ) {
                alt43=1;
            }
            else if ( LA43_0 >=42 && LA43_0<=43 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 1) ) {
                alt43=1;
            }
            else if ( LA43_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 2) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5438:2: rule__Activity__UnorderedGroup_6__2
                    {
                    pushFollow(FOLLOW_rule__Activity__UnorderedGroup_6__2_in_rule__Activity__UnorderedGroup_6__111049);
                    rule__Activity__UnorderedGroup_6__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__UnorderedGroup_6__1"


    // $ANTLR start "rule__Activity__UnorderedGroup_6__2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5445:1: rule__Activity__UnorderedGroup_6__2 : rule__Activity__UnorderedGroup_6__Impl ;
    public final void rule__Activity__UnorderedGroup_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5449:1: ( rule__Activity__UnorderedGroup_6__Impl )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5450:2: rule__Activity__UnorderedGroup_6__Impl
            {
            pushFollow(FOLLOW_rule__Activity__UnorderedGroup_6__Impl_in_rule__Activity__UnorderedGroup_6__211074);
            rule__Activity__UnorderedGroup_6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__UnorderedGroup_6__2"


    // $ANTLR start "rule__Program__DescriptionAssignment_0_0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5463:1: rule__Program__DescriptionAssignment_0_0 : ( RULE_ML_COMMENT ) ;
    public final void rule__Program__DescriptionAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5467:1: ( ( RULE_ML_COMMENT ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5468:1: ( RULE_ML_COMMENT )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5468:1: ( RULE_ML_COMMENT )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5469:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getProgramAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__Program__DescriptionAssignment_0_011108); 
             after(grammarAccess.getProgramAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__DescriptionAssignment_0_0"


    // $ANTLR start "rule__Program__NameAssignment_0_1_1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5478:1: rule__Program__NameAssignment_0_1_1 : ( RULE_ID ) ;
    public final void rule__Program__NameAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5482:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5483:1: ( RULE_ID )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5483:1: ( RULE_ID )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5484:1: RULE_ID
            {
             before(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_0_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Program__NameAssignment_0_1_111139); 
             after(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__NameAssignment_0_1_1"


    // $ANTLR start "rule__Program__LongNameAssignment_0_1_3_1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5493:1: rule__Program__LongNameAssignment_0_1_3_1 : ( RULE_STRING ) ;
    public final void rule__Program__LongNameAssignment_0_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5497:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5498:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5498:1: ( RULE_STRING )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5499:1: RULE_STRING
            {
             before(grammarAccess.getProgramAccess().getLongNameSTRINGTerminalRuleCall_0_1_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Program__LongNameAssignment_0_1_3_111170); 
             after(grammarAccess.getProgramAccess().getLongNameSTRINGTerminalRuleCall_0_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__LongNameAssignment_0_1_3_1"


    // $ANTLR start "rule__Program__PlansAssignment_0_1_4_0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5508:1: rule__Program__PlansAssignment_0_1_4_0 : ( rulePlanImport ) ;
    public final void rule__Program__PlansAssignment_0_1_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5512:1: ( ( rulePlanImport ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5513:1: ( rulePlanImport )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5513:1: ( rulePlanImport )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5514:1: rulePlanImport
            {
             before(grammarAccess.getProgramAccess().getPlansPlanImportParserRuleCall_0_1_4_0_0()); 
            pushFollow(FOLLOW_rulePlanImport_in_rule__Program__PlansAssignment_0_1_4_011201);
            rulePlanImport();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getPlansPlanImportParserRuleCall_0_1_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__PlansAssignment_0_1_4_0"


    // $ANTLR start "rule__Program__ReferencedProjectsAssignment_0_1_5_1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5523:1: rule__Program__ReferencedProjectsAssignment_0_1_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Program__ReferencedProjectsAssignment_0_1_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5527:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5528:1: ( ( ruleQualifiedName ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5528:1: ( ( ruleQualifiedName ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5529:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getProgramAccess().getReferencedProjectsProjectCrossReference_0_1_5_1_0()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5530:1: ( ruleQualifiedName )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5531:1: ruleQualifiedName
            {
             before(grammarAccess.getProgramAccess().getReferencedProjectsProjectQualifiedNameParserRuleCall_0_1_5_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Program__ReferencedProjectsAssignment_0_1_5_111236);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getReferencedProjectsProjectQualifiedNameParserRuleCall_0_1_5_1_0_1()); 

            }

             after(grammarAccess.getProgramAccess().getReferencedProjectsProjectCrossReference_0_1_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ReferencedProjectsAssignment_0_1_5_1"


    // $ANTLR start "rule__Program__ProjectsAssignment_0_1_6"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5542:1: rule__Program__ProjectsAssignment_0_1_6 : ( ruleProject ) ;
    public final void rule__Program__ProjectsAssignment_0_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5546:1: ( ( ruleProject ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5547:1: ( ruleProject )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5547:1: ( ruleProject )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5548:1: ruleProject
            {
             before(grammarAccess.getProgramAccess().getProjectsProjectParserRuleCall_0_1_6_0()); 
            pushFollow(FOLLOW_ruleProject_in_rule__Program__ProjectsAssignment_0_1_611271);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getProjectsProjectParserRuleCall_0_1_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ProjectsAssignment_0_1_6"


    // $ANTLR start "rule__Program__ProjectsAssignment_1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5557:1: rule__Program__ProjectsAssignment_1 : ( ruleProject ) ;
    public final void rule__Program__ProjectsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5561:1: ( ( ruleProject ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5562:1: ( ruleProject )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5562:1: ( ruleProject )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5563:1: ruleProject
            {
             before(grammarAccess.getProgramAccess().getProjectsProjectParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleProject_in_rule__Program__ProjectsAssignment_111302);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getProjectsProjectParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ProjectsAssignment_1"


    // $ANTLR start "rule__Project__DescriptionAssignment_0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5572:1: rule__Project__DescriptionAssignment_0 : ( RULE_ML_COMMENT ) ;
    public final void rule__Project__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5576:1: ( ( RULE_ML_COMMENT ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5577:1: ( RULE_ML_COMMENT )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5577:1: ( RULE_ML_COMMENT )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5578:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getProjectAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__Project__DescriptionAssignment_011333); 
             after(grammarAccess.getProjectAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__DescriptionAssignment_0"


    // $ANTLR start "rule__Project__NameAssignment_2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5587:1: rule__Project__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Project__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5591:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5592:1: ( RULE_ID )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5592:1: ( RULE_ID )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5593:1: RULE_ID
            {
             before(grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Project__NameAssignment_211364); 
             after(grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__NameAssignment_2"


    // $ANTLR start "rule__Project__LongNameAssignment_4_1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5602:1: rule__Project__LongNameAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Project__LongNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5606:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5607:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5607:1: ( RULE_STRING )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5608:1: RULE_STRING
            {
             before(grammarAccess.getProjectAccess().getLongNameSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Project__LongNameAssignment_4_111395); 
             after(grammarAccess.getProjectAccess().getLongNameSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__LongNameAssignment_4_1"


    // $ANTLR start "rule__Project__ResourcesAssignment_5"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5617:1: rule__Project__ResourcesAssignment_5 : ( ruleResources ) ;
    public final void rule__Project__ResourcesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5621:1: ( ( ruleResources ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5622:1: ( ruleResources )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5622:1: ( ruleResources )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5623:1: ruleResources
            {
             before(grammarAccess.getProjectAccess().getResourcesResourcesParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleResources_in_rule__Project__ResourcesAssignment_511426);
            ruleResources();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getResourcesResourcesParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__ResourcesAssignment_5"


    // $ANTLR start "rule__Project__PlansAssignment_6_0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5632:1: rule__Project__PlansAssignment_6_0 : ( rulePlanImport ) ;
    public final void rule__Project__PlansAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5636:1: ( ( rulePlanImport ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5637:1: ( rulePlanImport )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5637:1: ( rulePlanImport )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5638:1: rulePlanImport
            {
             before(grammarAccess.getProjectAccess().getPlansPlanImportParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_rulePlanImport_in_rule__Project__PlansAssignment_6_011457);
            rulePlanImport();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getPlansPlanImportParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__PlansAssignment_6_0"


    // $ANTLR start "rule__Project__AssumptionsAssignment_7_2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5647:1: rule__Project__AssumptionsAssignment_7_2 : ( ruleAssumption ) ;
    public final void rule__Project__AssumptionsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5651:1: ( ( ruleAssumption ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5652:1: ( ruleAssumption )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5652:1: ( ruleAssumption )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5653:1: ruleAssumption
            {
             before(grammarAccess.getProjectAccess().getAssumptionsAssumptionParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_ruleAssumption_in_rule__Project__AssumptionsAssignment_7_211488);
            ruleAssumption();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getAssumptionsAssumptionParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__AssumptionsAssignment_7_2"


    // $ANTLR start "rule__Project__ConstraintsAssignment_8_2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5662:1: rule__Project__ConstraintsAssignment_8_2 : ( ruleConstraint ) ;
    public final void rule__Project__ConstraintsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5666:1: ( ( ruleConstraint ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5667:1: ( ruleConstraint )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5667:1: ( ruleConstraint )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5668:1: ruleConstraint
            {
             before(grammarAccess.getProjectAccess().getConstraintsConstraintParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_ruleConstraint_in_rule__Project__ConstraintsAssignment_8_211519);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getConstraintsConstraintParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__ConstraintsAssignment_8_2"


    // $ANTLR start "rule__Project__ActivitiesAssignment_9"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5677:1: rule__Project__ActivitiesAssignment_9 : ( ruleActivityElement ) ;
    public final void rule__Project__ActivitiesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5681:1: ( ( ruleActivityElement ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5682:1: ( ruleActivityElement )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5682:1: ( ruleActivityElement )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5683:1: ruleActivityElement
            {
             before(grammarAccess.getProjectAccess().getActivitiesActivityElementParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleActivityElement_in_rule__Project__ActivitiesAssignment_911550);
            ruleActivityElement();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getActivitiesActivityElementParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__ActivitiesAssignment_9"


    // $ANTLR start "rule__Assumption__ValueAssignment_1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5692:1: rule__Assumption__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Assumption__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5696:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5697:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5697:1: ( RULE_STRING )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5698:1: RULE_STRING
            {
             before(grammarAccess.getAssumptionAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Assumption__ValueAssignment_111581); 
             after(grammarAccess.getAssumptionAccess().getValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assumption__ValueAssignment_1"


    // $ANTLR start "rule__Constraint__ValueAssignment_1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5707:1: rule__Constraint__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Constraint__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5711:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5712:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5712:1: ( RULE_STRING )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5713:1: RULE_STRING
            {
             before(grammarAccess.getConstraintAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Constraint__ValueAssignment_111612); 
             after(grammarAccess.getConstraintAccess().getValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__ValueAssignment_1"


    // $ANTLR start "rule__ActivityGroup__DescriptionAssignment_0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5722:1: rule__ActivityGroup__DescriptionAssignment_0 : ( RULE_ML_COMMENT ) ;
    public final void rule__ActivityGroup__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5726:1: ( ( RULE_ML_COMMENT ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5727:1: ( RULE_ML_COMMENT )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5727:1: ( RULE_ML_COMMENT )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5728:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getActivityGroupAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__ActivityGroup__DescriptionAssignment_011643); 
             after(grammarAccess.getActivityGroupAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityGroup__DescriptionAssignment_0"


    // $ANTLR start "rule__ActivityGroup__NameAssignment_2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5737:1: rule__ActivityGroup__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ActivityGroup__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5741:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5742:1: ( RULE_ID )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5742:1: ( RULE_ID )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5743:1: RULE_ID
            {
             before(grammarAccess.getActivityGroupAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActivityGroup__NameAssignment_211674); 
             after(grammarAccess.getActivityGroupAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityGroup__NameAssignment_2"


    // $ANTLR start "rule__ActivityGroup__LongNameAssignment_4_1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5752:1: rule__ActivityGroup__LongNameAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__ActivityGroup__LongNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5756:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5757:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5757:1: ( RULE_STRING )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5758:1: RULE_STRING
            {
             before(grammarAccess.getActivityGroupAccess().getLongNameSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ActivityGroup__LongNameAssignment_4_111705); 
             after(grammarAccess.getActivityGroupAccess().getLongNameSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityGroup__LongNameAssignment_4_1"


    // $ANTLR start "rule__ActivityGroup__DependenciesAssignment_5_1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5767:1: rule__ActivityGroup__DependenciesAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ActivityGroup__DependenciesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5771:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5772:1: ( ( ruleQualifiedName ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5772:1: ( ( ruleQualifiedName ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5773:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getActivityGroupAccess().getDependenciesActivityElementCrossReference_5_1_0()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5774:1: ( ruleQualifiedName )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5775:1: ruleQualifiedName
            {
             before(grammarAccess.getActivityGroupAccess().getDependenciesActivityElementQualifiedNameParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ActivityGroup__DependenciesAssignment_5_111740);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getActivityGroupAccess().getDependenciesActivityElementQualifiedNameParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getActivityGroupAccess().getDependenciesActivityElementCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityGroup__DependenciesAssignment_5_1"


    // $ANTLR start "rule__ActivityGroup__ActivitiesAssignment_6"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5786:1: rule__ActivityGroup__ActivitiesAssignment_6 : ( ruleActivityElement ) ;
    public final void rule__ActivityGroup__ActivitiesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5790:1: ( ( ruleActivityElement ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5791:1: ( ruleActivityElement )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5791:1: ( ruleActivityElement )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5792:1: ruleActivityElement
            {
             before(grammarAccess.getActivityGroupAccess().getActivitiesActivityElementParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleActivityElement_in_rule__ActivityGroup__ActivitiesAssignment_611775);
            ruleActivityElement();

            state._fsp--;

             after(grammarAccess.getActivityGroupAccess().getActivitiesActivityElementParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityGroup__ActivitiesAssignment_6"


    // $ANTLR start "rule__PlanImport__ImportURIAssignment_1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5803:1: rule__PlanImport__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__PlanImport__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5807:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5808:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5808:1: ( RULE_STRING )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5809:1: RULE_STRING
            {
             before(grammarAccess.getPlanImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PlanImport__ImportURIAssignment_111808); 
             after(grammarAccess.getPlanImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlanImport__ImportURIAssignment_1"


    // $ANTLR start "rule__Resources__ResourceAssignment_2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5818:1: rule__Resources__ResourceAssignment_2 : ( ruleResource ) ;
    public final void rule__Resources__ResourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5822:1: ( ( ruleResource ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5823:1: ( ruleResource )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5823:1: ( ruleResource )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5824:1: ruleResource
            {
             before(grammarAccess.getResourcesAccess().getResourceResourceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleResource_in_rule__Resources__ResourceAssignment_211839);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getResourcesAccess().getResourceResourceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__ResourceAssignment_2"


    // $ANTLR start "rule__Resource__NameAssignment_1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5833:1: rule__Resource__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Resource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5837:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5838:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5838:1: ( RULE_STRING )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5839:1: RULE_STRING
            {
             before(grammarAccess.getResourceAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Resource__NameAssignment_111870); 
             after(grammarAccess.getResourceAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__NameAssignment_1"


    // $ANTLR start "rule__CheckPoint__DescriptionAssignment_0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5848:1: rule__CheckPoint__DescriptionAssignment_0 : ( RULE_ML_COMMENT ) ;
    public final void rule__CheckPoint__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5852:1: ( ( RULE_ML_COMMENT ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5853:1: ( RULE_ML_COMMENT )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5853:1: ( RULE_ML_COMMENT )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5854:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getCheckPointAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__CheckPoint__DescriptionAssignment_011901); 
             after(grammarAccess.getCheckPointAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__DescriptionAssignment_0"


    // $ANTLR start "rule__CheckPoint__NameAssignment_2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5863:1: rule__CheckPoint__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CheckPoint__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5867:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5868:1: ( RULE_ID )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5868:1: ( RULE_ID )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5869:1: RULE_ID
            {
             before(grammarAccess.getCheckPointAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CheckPoint__NameAssignment_211932); 
             after(grammarAccess.getCheckPointAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__NameAssignment_2"


    // $ANTLR start "rule__CheckPoint__LongNameAssignment_4_1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5878:1: rule__CheckPoint__LongNameAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__CheckPoint__LongNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5882:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5883:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5883:1: ( RULE_STRING )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5884:1: RULE_STRING
            {
             before(grammarAccess.getCheckPointAccess().getLongNameSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CheckPoint__LongNameAssignment_4_111963); 
             after(grammarAccess.getCheckPointAccess().getLongNameSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__LongNameAssignment_4_1"


    // $ANTLR start "rule__CheckPoint__EndAssignment_5_0_0_1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5893:1: rule__CheckPoint__EndAssignment_5_0_0_1 : ( RULE_STRING ) ;
    public final void rule__CheckPoint__EndAssignment_5_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5897:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5898:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5898:1: ( RULE_STRING )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5899:1: RULE_STRING
            {
             before(grammarAccess.getCheckPointAccess().getEndSTRINGTerminalRuleCall_5_0_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CheckPoint__EndAssignment_5_0_0_111994); 
             after(grammarAccess.getCheckPointAccess().getEndSTRINGTerminalRuleCall_5_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__EndAssignment_5_0_0_1"


    // $ANTLR start "rule__CheckPoint__AfterAssignment_5_0_1_1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5908:1: rule__CheckPoint__AfterAssignment_5_0_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__CheckPoint__AfterAssignment_5_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5912:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5913:1: ( ( ruleQualifiedName ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5913:1: ( ( ruleQualifiedName ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5914:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getCheckPointAccess().getAfterActivityElementCrossReference_5_0_1_1_0()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5915:1: ( ruleQualifiedName )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5916:1: ruleQualifiedName
            {
             before(grammarAccess.getCheckPointAccess().getAfterActivityElementQualifiedNameParserRuleCall_5_0_1_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__CheckPoint__AfterAssignment_5_0_1_112029);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getCheckPointAccess().getAfterActivityElementQualifiedNameParserRuleCall_5_0_1_1_0_1()); 

            }

             after(grammarAccess.getCheckPointAccess().getAfterActivityElementCrossReference_5_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__AfterAssignment_5_0_1_1"


    // $ANTLR start "rule__CheckPoint__OffsetAssignment_5_0_1_3"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5927:1: rule__CheckPoint__OffsetAssignment_5_0_1_3 : ( RULE_INT ) ;
    public final void rule__CheckPoint__OffsetAssignment_5_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5931:1: ( ( RULE_INT ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5932:1: ( RULE_INT )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5932:1: ( RULE_INT )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5933:1: RULE_INT
            {
             before(grammarAccess.getCheckPointAccess().getOffsetINTTerminalRuleCall_5_0_1_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CheckPoint__OffsetAssignment_5_0_1_312064); 
             after(grammarAccess.getCheckPointAccess().getOffsetINTTerminalRuleCall_5_0_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__OffsetAssignment_5_0_1_3"


    // $ANTLR start "rule__CheckPoint__CompletenessAssignment_5_1_1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5942:1: rule__CheckPoint__CompletenessAssignment_5_1_1 : ( RULE_INT ) ;
    public final void rule__CheckPoint__CompletenessAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5946:1: ( ( RULE_INT ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5947:1: ( RULE_INT )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5947:1: ( RULE_INT )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5948:1: RULE_INT
            {
             before(grammarAccess.getCheckPointAccess().getCompletenessINTTerminalRuleCall_5_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CheckPoint__CompletenessAssignment_5_1_112095); 
             after(grammarAccess.getCheckPointAccess().getCompletenessINTTerminalRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__CompletenessAssignment_5_1_1"


    // $ANTLR start "rule__CheckPoint__DependenciesAssignment_5_1_4_1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5957:1: rule__CheckPoint__DependenciesAssignment_5_1_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__CheckPoint__DependenciesAssignment_5_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5961:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5962:1: ( ( ruleQualifiedName ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5962:1: ( ( ruleQualifiedName ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5963:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getCheckPointAccess().getDependenciesActivityElementCrossReference_5_1_4_1_0()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5964:1: ( ruleQualifiedName )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5965:1: ruleQualifiedName
            {
             before(grammarAccess.getCheckPointAccess().getDependenciesActivityElementQualifiedNameParserRuleCall_5_1_4_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__CheckPoint__DependenciesAssignment_5_1_4_112130);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getCheckPointAccess().getDependenciesActivityElementQualifiedNameParserRuleCall_5_1_4_1_0_1()); 

            }

             after(grammarAccess.getCheckPointAccess().getDependenciesActivityElementCrossReference_5_1_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__DependenciesAssignment_5_1_4_1"


    // $ANTLR start "rule__ResourceInvolvement__ResourceAssignment_0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5976:1: rule__ResourceInvolvement__ResourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ResourceInvolvement__ResourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5980:1: ( ( ( RULE_ID ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5981:1: ( ( RULE_ID ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5981:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5982:1: ( RULE_ID )
            {
             before(grammarAccess.getResourceInvolvementAccess().getResourceResourceCrossReference_0_0()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5983:1: ( RULE_ID )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5984:1: RULE_ID
            {
             before(grammarAccess.getResourceInvolvementAccess().getResourceResourceIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ResourceInvolvement__ResourceAssignment_012169); 
             after(grammarAccess.getResourceInvolvementAccess().getResourceResourceIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getResourceInvolvementAccess().getResourceResourceCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceInvolvement__ResourceAssignment_0"


    // $ANTLR start "rule__ResourceInvolvement__OccupationAssignment_1_1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5995:1: rule__ResourceInvolvement__OccupationAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__ResourceInvolvement__OccupationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5999:1: ( ( RULE_INT ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6000:1: ( RULE_INT )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6000:1: ( RULE_INT )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6001:1: RULE_INT
            {
             before(grammarAccess.getResourceInvolvementAccess().getOccupationINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ResourceInvolvement__OccupationAssignment_1_112204); 
             after(grammarAccess.getResourceInvolvementAccess().getOccupationINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceInvolvement__OccupationAssignment_1_1"


    // $ANTLR start "rule__ResourceInvolvement__ResponsibilityAssignment_2_1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6010:1: rule__ResourceInvolvement__ResponsibilityAssignment_2_1 : ( ruleResponsibility ) ;
    public final void rule__ResourceInvolvement__ResponsibilityAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6014:1: ( ( ruleResponsibility ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6015:1: ( ruleResponsibility )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6015:1: ( ruleResponsibility )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6016:1: ruleResponsibility
            {
             before(grammarAccess.getResourceInvolvementAccess().getResponsibilityResponsibilityEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleResponsibility_in_rule__ResourceInvolvement__ResponsibilityAssignment_2_112235);
            ruleResponsibility();

            state._fsp--;

             after(grammarAccess.getResourceInvolvementAccess().getResponsibilityResponsibilityEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceInvolvement__ResponsibilityAssignment_2_1"


    // $ANTLR start "rule__Activity__DescriptionAssignment_0"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6025:1: rule__Activity__DescriptionAssignment_0 : ( RULE_ML_COMMENT ) ;
    public final void rule__Activity__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6029:1: ( ( RULE_ML_COMMENT ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6030:1: ( RULE_ML_COMMENT )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6030:1: ( RULE_ML_COMMENT )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6031:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getActivityAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__Activity__DescriptionAssignment_012266); 
             after(grammarAccess.getActivityAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__DescriptionAssignment_0"


    // $ANTLR start "rule__Activity__NameAssignment_2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6040:1: rule__Activity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Activity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6044:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6045:1: ( RULE_ID )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6045:1: ( RULE_ID )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6046:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_212297); 
             after(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__NameAssignment_2"


    // $ANTLR start "rule__Activity__LongNameAssignment_4_1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6055:1: rule__Activity__LongNameAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Activity__LongNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6059:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6060:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6060:1: ( RULE_STRING )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6061:1: RULE_STRING
            {
             before(grammarAccess.getActivityAccess().getLongNameSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Activity__LongNameAssignment_4_112328); 
             after(grammarAccess.getActivityAccess().getLongNameSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__LongNameAssignment_4_1"


    // $ANTLR start "rule__Activity__InvolvedResourcesAssignment_5_2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6070:1: rule__Activity__InvolvedResourcesAssignment_5_2 : ( ruleResourceInvolvement ) ;
    public final void rule__Activity__InvolvedResourcesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6074:1: ( ( ruleResourceInvolvement ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6075:1: ( ruleResourceInvolvement )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6075:1: ( ruleResourceInvolvement )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6076:1: ruleResourceInvolvement
            {
             before(grammarAccess.getActivityAccess().getInvolvedResourcesResourceInvolvementParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_ruleResourceInvolvement_in_rule__Activity__InvolvedResourcesAssignment_5_212359);
            ruleResourceInvolvement();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getInvolvedResourcesResourceInvolvementParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__InvolvedResourcesAssignment_5_2"


    // $ANTLR start "rule__Activity__StartAssignment_6_0_0_1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6085:1: rule__Activity__StartAssignment_6_0_0_1 : ( RULE_STRING ) ;
    public final void rule__Activity__StartAssignment_6_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6089:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6090:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6090:1: ( RULE_STRING )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6091:1: RULE_STRING
            {
             before(grammarAccess.getActivityAccess().getStartSTRINGTerminalRuleCall_6_0_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Activity__StartAssignment_6_0_0_112390); 
             after(grammarAccess.getActivityAccess().getStartSTRINGTerminalRuleCall_6_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__StartAssignment_6_0_0_1"


    // $ANTLR start "rule__Activity__AfterAssignment_6_0_1_1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6100:1: rule__Activity__AfterAssignment_6_0_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Activity__AfterAssignment_6_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6104:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6105:1: ( ( ruleQualifiedName ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6105:1: ( ( ruleQualifiedName ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6106:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getActivityAccess().getAfterActivityElementCrossReference_6_0_1_1_0()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6107:1: ( ruleQualifiedName )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6108:1: ruleQualifiedName
            {
             before(grammarAccess.getActivityAccess().getAfterActivityElementQualifiedNameParserRuleCall_6_0_1_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Activity__AfterAssignment_6_0_1_112425);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getAfterActivityElementQualifiedNameParserRuleCall_6_0_1_1_0_1()); 

            }

             after(grammarAccess.getActivityAccess().getAfterActivityElementCrossReference_6_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__AfterAssignment_6_0_1_1"


    // $ANTLR start "rule__Activity__OffsetAssignment_6_0_1_3"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6119:1: rule__Activity__OffsetAssignment_6_0_1_3 : ( RULE_INT ) ;
    public final void rule__Activity__OffsetAssignment_6_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6123:1: ( ( RULE_INT ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6124:1: ( RULE_INT )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6124:1: ( RULE_INT )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6125:1: RULE_INT
            {
             before(grammarAccess.getActivityAccess().getOffsetINTTerminalRuleCall_6_0_1_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Activity__OffsetAssignment_6_0_1_312460); 
             after(grammarAccess.getActivityAccess().getOffsetINTTerminalRuleCall_6_0_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__OffsetAssignment_6_0_1_3"


    // $ANTLR start "rule__Activity__EndAssignment_6_1_0_0_1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6134:1: rule__Activity__EndAssignment_6_1_0_0_1 : ( RULE_STRING ) ;
    public final void rule__Activity__EndAssignment_6_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6138:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6139:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6139:1: ( RULE_STRING )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6140:1: RULE_STRING
            {
             before(grammarAccess.getActivityAccess().getEndSTRINGTerminalRuleCall_6_1_0_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Activity__EndAssignment_6_1_0_0_112491); 
             after(grammarAccess.getActivityAccess().getEndSTRINGTerminalRuleCall_6_1_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__EndAssignment_6_1_0_0_1"


    // $ANTLR start "rule__Activity__DurationAssignment_6_1_0_1_1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6149:1: rule__Activity__DurationAssignment_6_1_0_1_1 : ( RULE_INT ) ;
    public final void rule__Activity__DurationAssignment_6_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6153:1: ( ( RULE_INT ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6154:1: ( RULE_INT )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6154:1: ( RULE_INT )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6155:1: RULE_INT
            {
             before(grammarAccess.getActivityAccess().getDurationINTTerminalRuleCall_6_1_0_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Activity__DurationAssignment_6_1_0_1_112522); 
             after(grammarAccess.getActivityAccess().getDurationINTTerminalRuleCall_6_1_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__DurationAssignment_6_1_0_1_1"


    // $ANTLR start "rule__Activity__CompletenessAssignment_6_1_2"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6164:1: rule__Activity__CompletenessAssignment_6_1_2 : ( RULE_INT ) ;
    public final void rule__Activity__CompletenessAssignment_6_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6168:1: ( ( RULE_INT ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6169:1: ( RULE_INT )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6169:1: ( RULE_INT )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6170:1: RULE_INT
            {
             before(grammarAccess.getActivityAccess().getCompletenessINTTerminalRuleCall_6_1_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Activity__CompletenessAssignment_6_1_212553); 
             after(grammarAccess.getActivityAccess().getCompletenessINTTerminalRuleCall_6_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__CompletenessAssignment_6_1_2"


    // $ANTLR start "rule__Activity__DependenciesAssignment_6_2_1"
    // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6179:1: rule__Activity__DependenciesAssignment_6_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Activity__DependenciesAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6183:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6184:1: ( ( ruleQualifiedName ) )
            {
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6184:1: ( ( ruleQualifiedName ) )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6185:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getActivityAccess().getDependenciesActivityElementCrossReference_6_2_1_0()); 
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6186:1: ( ruleQualifiedName )
            // ../com.lowcoupling.lng.plan.ui/src-gen/com/lowcoupling/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6187:1: ruleQualifiedName
            {
             before(grammarAccess.getActivityAccess().getDependenciesActivityElementQualifiedNameParserRuleCall_6_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Activity__DependenciesAssignment_6_2_112588);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getDependenciesActivityElementQualifiedNameParserRuleCall_6_2_1_0_1()); 

            }

             after(grammarAccess.getActivityAccess().getDependenciesActivityElementCrossReference_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__DependenciesAssignment_6_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Alternatives_in_ruleProgram94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_entryRuleProject121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProject128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__0_in_ruleProject154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssumption_in_entryRuleAssumption181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssumption188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assumption__Group__0_in_ruleAssumption214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0_in_ruleConstraint274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityGroup_in_entryRuleActivityGroup301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityGroup308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__0_in_ruleActivityGroup334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlanImport_in_entryRulePlanImport365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlanImport372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlanImport__Group__0_in_rulePlanImport398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityElement_in_entryRuleActivityElement487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityElement494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityElement__Alternatives_in_ruleActivityElement520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_entryRuleENDLINE547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleENDLINE554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleENDLINE581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResources_in_entryRuleResources609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResources616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resources__Group__0_in_ruleResources642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__0_in_ruleResource702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckPoint_in_entryRuleCheckPoint729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckPoint736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__0_in_ruleCheckPoint762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceInvolvement_in_entryRuleResourceInvolvement789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceInvolvement796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group__0_in_ruleResourceInvolvement822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0_in_ruleActivity882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Responsibility__Alternatives_in_ruleResponsibility921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0__0_in_rule__Program__Alternatives956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__ProjectsAssignment_1_in_rule__Program__Alternatives974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_rule__ActivityElement__Alternatives1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckPoint_in_rule__ActivityElement__Alternatives1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityGroup_in_rule__ActivityElement__Alternatives1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_0_0__0_in_rule__CheckPoint__Alternatives_5_01073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_0_1__0_in_rule__CheckPoint__Alternatives_5_01091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_0_0__0_in_rule__Activity__Alternatives_6_01124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_0_1__0_in_rule__Activity__Alternatives_6_01142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1_0_0__0_in_rule__Activity__Alternatives_6_1_01175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1_0_1__0_in_rule__Activity__Alternatives_6_1_01193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Responsibility__Alternatives1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Responsibility__Alternatives1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Responsibility__Alternatives1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Responsibility__Alternatives1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0__0__Impl_in_rule__Program__Group_0__01323 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Program__Group_0__1_in_rule__Program__Group_0__01326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__DescriptionAssignment_0_0_in_rule__Program__Group_0__0__Impl1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0__1__Impl_in_rule__Program__Group_0__11384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__0_in_rule__Program__Group_0__1__Impl1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__0__Impl_in_rule__Program__Group_0_1__01445 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__1_in_rule__Program__Group_0_1__01448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Program__Group_0_1__0__Impl1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__1__Impl_in_rule__Program__Group_0_1__11507 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__2_in_rule__Program__Group_0_1__11510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__NameAssignment_0_1_1_in_rule__Program__Group_0_1__1__Impl1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__2__Impl_in_rule__Program__Group_0_1__21567 = new BitSet(new long[]{0x00000000083800A0L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__3_in_rule__Program__Group_0_1__21570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__Program__Group_0_1__2__Impl1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__3__Impl_in_rule__Program__Group_0_1__31626 = new BitSet(new long[]{0x00000000083800A0L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__4_in_rule__Program__Group_0_1__31629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_3__0_in_rule__Program__Group_0_1__3__Impl1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__4__Impl_in_rule__Program__Group_0_1__41687 = new BitSet(new long[]{0x00000000083800A0L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__5_in_rule__Program__Group_0_1__41690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_4__0_in_rule__Program__Group_0_1__4__Impl1717 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__5__Impl_in_rule__Program__Group_0_1__51748 = new BitSet(new long[]{0x00000000083800A0L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__6_in_rule__Program__Group_0_1__51751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_5__0_in_rule__Program__Group_0_1__5__Impl1778 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__6__Impl_in_rule__Program__Group_0_1__61809 = new BitSet(new long[]{0x00000000083800A0L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__7_in_rule__Program__Group_0_1__61812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__ProjectsAssignment_0_1_6_in_rule__Program__Group_0_1__6__Impl1839 = new BitSet(new long[]{0x0000000000200082L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__7__Impl_in_rule__Program__Group_0_1__71870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__Program__Group_0_1__7__Impl1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_3__0__Impl_in_rule__Program__Group_0_1_3__01942 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_3__1_in_rule__Program__Group_0_1_3__01945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Program__Group_0_1_3__0__Impl1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_3__1__Impl_in_rule__Program__Group_0_1_3__12004 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_3__2_in_rule__Program__Group_0_1_3__12007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__LongNameAssignment_0_1_3_1_in_rule__Program__Group_0_1_3__1__Impl2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_3__2__Impl_in_rule__Program__Group_0_1_3__22064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Program__Group_0_1_3__2__Impl2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_4__0__Impl_in_rule__Program__Group_0_1_4__02126 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_4__1_in_rule__Program__Group_0_1_4__02129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__PlansAssignment_0_1_4_0_in_rule__Program__Group_0_1_4__0__Impl2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_4__1__Impl_in_rule__Program__Group_0_1_4__12186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Program__Group_0_1_4__1__Impl2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_5__0__Impl_in_rule__Program__Group_0_1_5__02246 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_5__1_in_rule__Program__Group_0_1_5__02249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Program__Group_0_1_5__0__Impl2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_5__1__Impl_in_rule__Program__Group_0_1_5__12308 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_5__2_in_rule__Program__Group_0_1_5__12311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__ReferencedProjectsAssignment_0_1_5_1_in_rule__Program__Group_0_1_5__1__Impl2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_5__2__Impl_in_rule__Program__Group_0_1_5__22368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Program__Group_0_1_5__2__Impl2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__0__Impl_in_rule__Project__Group__02430 = new BitSet(new long[]{0x0000000000200080L});
    public static final BitSet FOLLOW_rule__Project__Group__1_in_rule__Project__Group__02433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__DescriptionAssignment_0_in_rule__Project__Group__0__Impl2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__1__Impl_in_rule__Project__Group__12491 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Project__Group__2_in_rule__Project__Group__12494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Project__Group__1__Impl2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__2__Impl_in_rule__Project__Group__22553 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Project__Group__3_in_rule__Project__Group__22556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__NameAssignment_2_in_rule__Project__Group__2__Impl2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__3__Impl_in_rule__Project__Group__32613 = new BitSet(new long[]{0x00000080AAC800A0L});
    public static final BitSet FOLLOW_rule__Project__Group__4_in_rule__Project__Group__32616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__Project__Group__3__Impl2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__4__Impl_in_rule__Project__Group__42672 = new BitSet(new long[]{0x00000080AAC800A0L});
    public static final BitSet FOLLOW_rule__Project__Group__5_in_rule__Project__Group__42675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_4__0_in_rule__Project__Group__4__Impl2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__5__Impl_in_rule__Project__Group__52733 = new BitSet(new long[]{0x00000080AAC800A0L});
    public static final BitSet FOLLOW_rule__Project__Group__6_in_rule__Project__Group__52736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__ResourcesAssignment_5_in_rule__Project__Group__5__Impl2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__6__Impl_in_rule__Project__Group__62794 = new BitSet(new long[]{0x00000080AAC800A0L});
    public static final BitSet FOLLOW_rule__Project__Group__7_in_rule__Project__Group__62797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_6__0_in_rule__Project__Group__6__Impl2824 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Project__Group__7__Impl_in_rule__Project__Group__72855 = new BitSet(new long[]{0x00000080AAC800A0L});
    public static final BitSet FOLLOW_rule__Project__Group__8_in_rule__Project__Group__72858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_7__0_in_rule__Project__Group__7__Impl2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__8__Impl_in_rule__Project__Group__82916 = new BitSet(new long[]{0x00000080AAC800A0L});
    public static final BitSet FOLLOW_rule__Project__Group__9_in_rule__Project__Group__82919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_8__0_in_rule__Project__Group__8__Impl2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__9__Impl_in_rule__Project__Group__92977 = new BitSet(new long[]{0x00000080AAC800A0L});
    public static final BitSet FOLLOW_rule__Project__Group__10_in_rule__Project__Group__92980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__ActivitiesAssignment_9_in_rule__Project__Group__9__Impl3007 = new BitSet(new long[]{0x0000008082000082L});
    public static final BitSet FOLLOW_rule__Project__Group__10__Impl_in_rule__Project__Group__103038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__Project__Group__10__Impl3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_4__0__Impl_in_rule__Project__Group_4__03116 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Project__Group_4__1_in_rule__Project__Group_4__03119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Project__Group_4__0__Impl3147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_4__1__Impl_in_rule__Project__Group_4__13178 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Project__Group_4__2_in_rule__Project__Group_4__13181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__LongNameAssignment_4_1_in_rule__Project__Group_4__1__Impl3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_4__2__Impl_in_rule__Project__Group_4__23238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Project__Group_4__2__Impl3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_6__0__Impl_in_rule__Project__Group_6__03300 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Project__Group_6__1_in_rule__Project__Group_6__03303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__PlansAssignment_6_0_in_rule__Project__Group_6__0__Impl3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_6__1__Impl_in_rule__Project__Group_6__13360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Project__Group_6__1__Impl3387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_7__0__Impl_in_rule__Project__Group_7__03420 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Project__Group_7__1_in_rule__Project__Group_7__03423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Project__Group_7__0__Impl3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_7__1__Impl_in_rule__Project__Group_7__13482 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_rule__Project__Group_7__2_in_rule__Project__Group_7__13485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__Project__Group_7__1__Impl3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_7__2__Impl_in_rule__Project__Group_7__23541 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_rule__Project__Group_7__3_in_rule__Project__Group_7__23544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__AssumptionsAssignment_7_2_in_rule__Project__Group_7__2__Impl3571 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Project__Group_7__3__Impl_in_rule__Project__Group_7__33602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__Project__Group_7__3__Impl3629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_8__0__Impl_in_rule__Project__Group_8__03666 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Project__Group_8__1_in_rule__Project__Group_8__03669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Project__Group_8__0__Impl3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_8__1__Impl_in_rule__Project__Group_8__13728 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_rule__Project__Group_8__2_in_rule__Project__Group_8__13731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__Project__Group_8__1__Impl3758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_8__2__Impl_in_rule__Project__Group_8__23787 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_rule__Project__Group_8__3_in_rule__Project__Group_8__23790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__ConstraintsAssignment_8_2_in_rule__Project__Group_8__2__Impl3817 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Project__Group_8__3__Impl_in_rule__Project__Group_8__33848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__Project__Group_8__3__Impl3875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assumption__Group__0__Impl_in_rule__Assumption__Group__03912 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Assumption__Group__1_in_rule__Assumption__Group__03915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Assumption__Group__0__Impl3943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assumption__Group__1__Impl_in_rule__Assumption__Group__13974 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Assumption__Group__2_in_rule__Assumption__Group__13977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assumption__ValueAssignment_1_in_rule__Assumption__Group__1__Impl4004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assumption__Group__2__Impl_in_rule__Assumption__Group__24034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Assumption__Group__2__Impl4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__04096 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__04099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Constraint__Group__0__Impl4127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__14158 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__14161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__ValueAssignment_1_in_rule__Constraint__Group__1__Impl4188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__2__Impl_in_rule__Constraint__Group__24218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Constraint__Group__2__Impl4245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__0__Impl_in_rule__ActivityGroup__Group__04280 = new BitSet(new long[]{0x0000008082000080L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__1_in_rule__ActivityGroup__Group__04283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__DescriptionAssignment_0_in_rule__ActivityGroup__Group__0__Impl4310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__1__Impl_in_rule__ActivityGroup__Group__14341 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__2_in_rule__ActivityGroup__Group__14344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ActivityGroup__Group__1__Impl4372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__2__Impl_in_rule__ActivityGroup__Group__24403 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__3_in_rule__ActivityGroup__Group__24406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__NameAssignment_2_in_rule__ActivityGroup__Group__2__Impl4433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__3__Impl_in_rule__ActivityGroup__Group__34463 = new BitSet(new long[]{0x00000080860800A0L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__4_in_rule__ActivityGroup__Group__34466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__ActivityGroup__Group__3__Impl4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__4__Impl_in_rule__ActivityGroup__Group__44522 = new BitSet(new long[]{0x00000080860800A0L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__5_in_rule__ActivityGroup__Group__44525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_4__0_in_rule__ActivityGroup__Group__4__Impl4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__5__Impl_in_rule__ActivityGroup__Group__54583 = new BitSet(new long[]{0x00000080860800A0L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__6_in_rule__ActivityGroup__Group__54586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_5__0_in_rule__ActivityGroup__Group__5__Impl4613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__6__Impl_in_rule__ActivityGroup__Group__64644 = new BitSet(new long[]{0x00000080860800A0L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__7_in_rule__ActivityGroup__Group__64647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__ActivitiesAssignment_6_in_rule__ActivityGroup__Group__6__Impl4674 = new BitSet(new long[]{0x0000008082000082L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__7__Impl_in_rule__ActivityGroup__Group__74705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__ActivityGroup__Group__7__Impl4732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_4__0__Impl_in_rule__ActivityGroup__Group_4__04777 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_4__1_in_rule__ActivityGroup__Group_4__04780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ActivityGroup__Group_4__0__Impl4808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_4__1__Impl_in_rule__ActivityGroup__Group_4__14839 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_4__2_in_rule__ActivityGroup__Group_4__14842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__LongNameAssignment_4_1_in_rule__ActivityGroup__Group_4__1__Impl4869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_4__2__Impl_in_rule__ActivityGroup__Group_4__24899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__ActivityGroup__Group_4__2__Impl4926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_5__0__Impl_in_rule__ActivityGroup__Group_5__04961 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_5__1_in_rule__ActivityGroup__Group_5__04964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ActivityGroup__Group_5__0__Impl4992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_5__1__Impl_in_rule__ActivityGroup__Group_5__15023 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_5__2_in_rule__ActivityGroup__Group_5__15026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__DependenciesAssignment_5_1_in_rule__ActivityGroup__Group_5__1__Impl5053 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_5__2__Impl_in_rule__ActivityGroup__Group_5__25084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__ActivityGroup__Group_5__2__Impl5111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlanImport__Group__0__Impl_in_rule__PlanImport__Group__05148 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__PlanImport__Group__1_in_rule__PlanImport__Group__05151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__PlanImport__Group__0__Impl5179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlanImport__Group__1__Impl_in_rule__PlanImport__Group__15210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlanImport__ImportURIAssignment_1_in_rule__PlanImport__Group__1__Impl5237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__05271 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__05274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl5301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__15330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl5357 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__05392 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__05395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__QualifiedName__Group_1__0__Impl5423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__15454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl5481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resources__Group__0__Impl_in_rule__Resources__Group__05515 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Resources__Group__1_in_rule__Resources__Group__05518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Resources__Group__0__Impl5546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resources__Group__1__Impl_in_rule__Resources__Group__15577 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_rule__Resources__Group__2_in_rule__Resources__Group__15580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__Resources__Group__1__Impl5607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resources__Group__2__Impl_in_rule__Resources__Group__25636 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_rule__Resources__Group__3_in_rule__Resources__Group__25639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resources__ResourceAssignment_2_in_rule__Resources__Group__2__Impl5666 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Resources__Group__3__Impl_in_rule__Resources__Group__35697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__Resources__Group__3__Impl5724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__0__Impl_in_rule__Resource__Group__05761 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Resource__Group__1_in_rule__Resource__Group__05764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Resource__Group__0__Impl5792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__1__Impl_in_rule__Resource__Group__15823 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Resource__Group__2_in_rule__Resource__Group__15826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__NameAssignment_1_in_rule__Resource__Group__1__Impl5853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__2__Impl_in_rule__Resource__Group__25883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Resource__Group__2__Impl5910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__0__Impl_in_rule__CheckPoint__Group__05945 = new BitSet(new long[]{0x0000000080000080L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__1_in_rule__CheckPoint__Group__05948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__DescriptionAssignment_0_in_rule__CheckPoint__Group__0__Impl5975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__1__Impl_in_rule__CheckPoint__Group__16006 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__2_in_rule__CheckPoint__Group__16009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__CheckPoint__Group__1__Impl6037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__2__Impl_in_rule__CheckPoint__Group__26068 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__3_in_rule__CheckPoint__Group__26071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__NameAssignment_2_in_rule__CheckPoint__Group__2__Impl6098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__3__Impl_in_rule__CheckPoint__Group__36128 = new BitSet(new long[]{0x0000000B00080000L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__4_in_rule__CheckPoint__Group__36131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__CheckPoint__Group__3__Impl6158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__4__Impl_in_rule__CheckPoint__Group__46187 = new BitSet(new long[]{0x0000000B00080000L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__5_in_rule__CheckPoint__Group__46190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4__0_in_rule__CheckPoint__Group__4__Impl6217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__5__Impl_in_rule__CheckPoint__Group__56248 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__6_in_rule__CheckPoint__Group__56251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__UnorderedGroup_5_in_rule__CheckPoint__Group__5__Impl6278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__6__Impl_in_rule__CheckPoint__Group__66308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__CheckPoint__Group__6__Impl6335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4__0__Impl_in_rule__CheckPoint__Group_4__06378 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4__1_in_rule__CheckPoint__Group_4__06381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CheckPoint__Group_4__0__Impl6409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4__1__Impl_in_rule__CheckPoint__Group_4__16440 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4__2_in_rule__CheckPoint__Group_4__16443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__LongNameAssignment_4_1_in_rule__CheckPoint__Group_4__1__Impl6470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4__2__Impl_in_rule__CheckPoint__Group_4__26500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_4__2__Impl6527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_0_0__0__Impl_in_rule__CheckPoint__Group_5_0_0__06562 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_0_0__1_in_rule__CheckPoint__Group_5_0_0__06565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__CheckPoint__Group_5_0_0__0__Impl6593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_0_0__1__Impl_in_rule__CheckPoint__Group_5_0_0__16624 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_0_0__2_in_rule__CheckPoint__Group_5_0_0__16627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__EndAssignment_5_0_0_1_in_rule__CheckPoint__Group_5_0_0__1__Impl6654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_0_0__2__Impl_in_rule__CheckPoint__Group_5_0_0__26684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_5_0_0__2__Impl6711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_0_1__0__Impl_in_rule__CheckPoint__Group_5_0_1__06746 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_0_1__1_in_rule__CheckPoint__Group_5_0_1__06749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__CheckPoint__Group_5_0_1__0__Impl6777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_0_1__1__Impl_in_rule__CheckPoint__Group_5_0_1__16808 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_0_1__2_in_rule__CheckPoint__Group_5_0_1__16811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__AfterAssignment_5_0_1_1_in_rule__CheckPoint__Group_5_0_1__1__Impl6838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_0_1__2__Impl_in_rule__CheckPoint__Group_5_0_1__26868 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_0_1__3_in_rule__CheckPoint__Group_5_0_1__26871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__CheckPoint__Group_5_0_1__2__Impl6899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_0_1__3__Impl_in_rule__CheckPoint__Group_5_0_1__36930 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_0_1__4_in_rule__CheckPoint__Group_5_0_1__36933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__OffsetAssignment_5_0_1_3_in_rule__CheckPoint__Group_5_0_1__3__Impl6960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_0_1__4__Impl_in_rule__CheckPoint__Group_5_0_1__46990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_5_0_1__4__Impl7017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_1__0__Impl_in_rule__CheckPoint__Group_5_1__07056 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_1__1_in_rule__CheckPoint__Group_5_1__07059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__CheckPoint__Group_5_1__0__Impl7087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_1__1__Impl_in_rule__CheckPoint__Group_5_1__17118 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_1__2_in_rule__CheckPoint__Group_5_1__17121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__CompletenessAssignment_5_1_1_in_rule__CheckPoint__Group_5_1__1__Impl7148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_1__2__Impl_in_rule__CheckPoint__Group_5_1__27178 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_1__3_in_rule__CheckPoint__Group_5_1__27181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__CheckPoint__Group_5_1__2__Impl7209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_1__3__Impl_in_rule__CheckPoint__Group_5_1__37240 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_1__4_in_rule__CheckPoint__Group_5_1__37243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_5_1__3__Impl7270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_1__4__Impl_in_rule__CheckPoint__Group_5_1__47299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_1_4__0_in_rule__CheckPoint__Group_5_1__4__Impl7326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_1_4__0__Impl_in_rule__CheckPoint__Group_5_1_4__07367 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_1_4__1_in_rule__CheckPoint__Group_5_1_4__07370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CheckPoint__Group_5_1_4__0__Impl7398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_1_4__1__Impl_in_rule__CheckPoint__Group_5_1_4__17429 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_1_4__2_in_rule__CheckPoint__Group_5_1_4__17432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__DependenciesAssignment_5_1_4_1_in_rule__CheckPoint__Group_5_1_4__1__Impl7459 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_1_4__2__Impl_in_rule__CheckPoint__Group_5_1_4__27490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_5_1_4__2__Impl7517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group__0__Impl_in_rule__ResourceInvolvement__Group__07552 = new BitSet(new long[]{0x0000006000002000L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group__1_in_rule__ResourceInvolvement__Group__07555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__ResourceAssignment_0_in_rule__ResourceInvolvement__Group__0__Impl7582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group__1__Impl_in_rule__ResourceInvolvement__Group__17612 = new BitSet(new long[]{0x0000006000002000L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group__2_in_rule__ResourceInvolvement__Group__17615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_1__0_in_rule__ResourceInvolvement__Group__1__Impl7642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group__2__Impl_in_rule__ResourceInvolvement__Group__27673 = new BitSet(new long[]{0x0000006000002000L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group__3_in_rule__ResourceInvolvement__Group__27676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_2__0_in_rule__ResourceInvolvement__Group__2__Impl7703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group__3__Impl_in_rule__ResourceInvolvement__Group__37734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__ResourceInvolvement__Group__3__Impl7761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_1__0__Impl_in_rule__ResourceInvolvement__Group_1__07798 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_1__1_in_rule__ResourceInvolvement__Group_1__07801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ResourceInvolvement__Group_1__0__Impl7829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_1__1__Impl_in_rule__ResourceInvolvement__Group_1__17860 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_1__2_in_rule__ResourceInvolvement__Group_1__17863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__OccupationAssignment_1_1_in_rule__ResourceInvolvement__Group_1__1__Impl7890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_1__2__Impl_in_rule__ResourceInvolvement__Group_1__27920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ResourceInvolvement__Group_1__2__Impl7948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_2__0__Impl_in_rule__ResourceInvolvement__Group_2__07985 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_2__1_in_rule__ResourceInvolvement__Group_2__07988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ResourceInvolvement__Group_2__0__Impl8016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_2__1__Impl_in_rule__ResourceInvolvement__Group_2__18047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__ResponsibilityAssignment_2_1_in_rule__ResourceInvolvement__Group_2__1__Impl8074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__08108 = new BitSet(new long[]{0x0000008000000080L});
    public static final BitSet FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__08111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__DescriptionAssignment_0_in_rule__Activity__Group__0__Impl8138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__18169 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__18172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Activity__Group__1__Impl8200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__28231 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__28234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__NameAssignment_2_in_rule__Activity__Group__2__Impl8261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__38291 = new BitSet(new long[]{0x00000F0204080000L});
    public static final BitSet FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__38294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__Activity__Group__3__Impl8321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__48350 = new BitSet(new long[]{0x00000F0204080000L});
    public static final BitSet FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__48353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__0_in_rule__Activity__Group__4__Impl8380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__58411 = new BitSet(new long[]{0x00000F0204080000L});
    public static final BitSet FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__58414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__0_in_rule__Activity__Group__5__Impl8441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__68472 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__68475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__UnorderedGroup_6_in_rule__Activity__Group__6__Impl8502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__78532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__Activity__Group__7__Impl8559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__0__Impl_in_rule__Activity__Group_4__08604 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__1_in_rule__Activity__Group_4__08607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Activity__Group_4__0__Impl8635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__1__Impl_in_rule__Activity__Group_4__18666 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__2_in_rule__Activity__Group_4__18669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__LongNameAssignment_4_1_in_rule__Activity__Group_4__1__Impl8696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__2__Impl_in_rule__Activity__Group_4__28726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Activity__Group_4__2__Impl8753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__0__Impl_in_rule__Activity__Group_5__08788 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__1_in_rule__Activity__Group_5__08791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Activity__Group_5__0__Impl8819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__1__Impl_in_rule__Activity__Group_5__18850 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__2_in_rule__Activity__Group_5__18853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__Activity__Group_5__1__Impl8880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__2__Impl_in_rule__Activity__Group_5__28909 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__3_in_rule__Activity__Group_5__28912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__InvolvedResourcesAssignment_5_2_in_rule__Activity__Group_5__2__Impl8939 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__3__Impl_in_rule__Activity__Group_5__38970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__Activity__Group_5__3__Impl8997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_0_0__0__Impl_in_rule__Activity__Group_6_0_0__09034 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_0_0__1_in_rule__Activity__Group_6_0_0__09037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Activity__Group_6_0_0__0__Impl9065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_0_0__1__Impl_in_rule__Activity__Group_6_0_0__19096 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_0_0__2_in_rule__Activity__Group_6_0_0__19099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__StartAssignment_6_0_0_1_in_rule__Activity__Group_6_0_0__1__Impl9126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_0_0__2__Impl_in_rule__Activity__Group_6_0_0__29156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Activity__Group_6_0_0__2__Impl9183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_0_1__0__Impl_in_rule__Activity__Group_6_0_1__09218 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_0_1__1_in_rule__Activity__Group_6_0_1__09221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Activity__Group_6_0_1__0__Impl9249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_0_1__1__Impl_in_rule__Activity__Group_6_0_1__19280 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_0_1__2_in_rule__Activity__Group_6_0_1__19283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__AfterAssignment_6_0_1_1_in_rule__Activity__Group_6_0_1__1__Impl9310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_0_1__2__Impl_in_rule__Activity__Group_6_0_1__29340 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_0_1__3_in_rule__Activity__Group_6_0_1__29343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Activity__Group_6_0_1__2__Impl9371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_0_1__3__Impl_in_rule__Activity__Group_6_0_1__39402 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_0_1__4_in_rule__Activity__Group_6_0_1__39405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__OffsetAssignment_6_0_1_3_in_rule__Activity__Group_6_0_1__3__Impl9432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_0_1__4__Impl_in_rule__Activity__Group_6_0_1__49462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Activity__Group_6_0_1__4__Impl9489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1__0__Impl_in_rule__Activity__Group_6_1__09528 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1__1_in_rule__Activity__Group_6_1__09531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Alternatives_6_1_0_in_rule__Activity__Group_6_1__0__Impl9558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1__1__Impl_in_rule__Activity__Group_6_1__19588 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1__2_in_rule__Activity__Group_6_1__19591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Activity__Group_6_1__1__Impl9619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1__2__Impl_in_rule__Activity__Group_6_1__29650 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1__3_in_rule__Activity__Group_6_1__29653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__CompletenessAssignment_6_1_2_in_rule__Activity__Group_6_1__2__Impl9680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1__3__Impl_in_rule__Activity__Group_6_1__39710 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1__4_in_rule__Activity__Group_6_1__39713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Activity__Group_6_1__3__Impl9741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1__4__Impl_in_rule__Activity__Group_6_1__49772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Activity__Group_6_1__4__Impl9799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1_0_0__0__Impl_in_rule__Activity__Group_6_1_0_0__09838 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1_0_0__1_in_rule__Activity__Group_6_1_0_0__09841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Activity__Group_6_1_0_0__0__Impl9869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1_0_0__1__Impl_in_rule__Activity__Group_6_1_0_0__19900 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1_0_0__2_in_rule__Activity__Group_6_1_0_0__19903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__EndAssignment_6_1_0_0_1_in_rule__Activity__Group_6_1_0_0__1__Impl9930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1_0_0__2__Impl_in_rule__Activity__Group_6_1_0_0__29960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Activity__Group_6_1_0_0__2__Impl9987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1_0_1__0__Impl_in_rule__Activity__Group_6_1_0_1__010022 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1_0_1__1_in_rule__Activity__Group_6_1_0_1__010025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Activity__Group_6_1_0_1__0__Impl10053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1_0_1__1__Impl_in_rule__Activity__Group_6_1_0_1__110084 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1_0_1__2_in_rule__Activity__Group_6_1_0_1__110087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__DurationAssignment_6_1_0_1_1_in_rule__Activity__Group_6_1_0_1__1__Impl10114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1_0_1__2__Impl_in_rule__Activity__Group_6_1_0_1__210144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Activity__Group_6_1_0_1__2__Impl10171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_2__0__Impl_in_rule__Activity__Group_6_2__010206 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_2__1_in_rule__Activity__Group_6_2__010209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Activity__Group_6_2__0__Impl10237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_2__1__Impl_in_rule__Activity__Group_6_2__110268 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_2__2_in_rule__Activity__Group_6_2__110271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__DependenciesAssignment_6_2_1_in_rule__Activity__Group_6_2__1__Impl10298 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_2__2__Impl_in_rule__Activity__Group_6_2__210329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Activity__Group_6_2__2__Impl10356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__UnorderedGroup_5__0_in_rule__CheckPoint__UnorderedGroup_510393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Alternatives_5_0_in_rule__CheckPoint__UnorderedGroup_5__Impl10482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_1__0_in_rule__CheckPoint__UnorderedGroup_5__Impl10573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__UnorderedGroup_5__Impl_in_rule__CheckPoint__UnorderedGroup_5__010632 = new BitSet(new long[]{0x0000000B00080002L});
    public static final BitSet FOLLOW_rule__CheckPoint__UnorderedGroup_5__1_in_rule__CheckPoint__UnorderedGroup_5__010635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__UnorderedGroup_5__Impl_in_rule__CheckPoint__UnorderedGroup_5__110660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__UnorderedGroup_6__0_in_rule__Activity__UnorderedGroup_610688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Alternatives_6_0_in_rule__Activity__UnorderedGroup_6__Impl10777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1__0_in_rule__Activity__UnorderedGroup_6__Impl10868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_2__0_in_rule__Activity__UnorderedGroup_6__Impl10959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__UnorderedGroup_6__Impl_in_rule__Activity__UnorderedGroup_6__011018 = new BitSet(new long[]{0x00000F0204080002L});
    public static final BitSet FOLLOW_rule__Activity__UnorderedGroup_6__1_in_rule__Activity__UnorderedGroup_6__011021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__UnorderedGroup_6__Impl_in_rule__Activity__UnorderedGroup_6__111046 = new BitSet(new long[]{0x00000F0204080002L});
    public static final BitSet FOLLOW_rule__Activity__UnorderedGroup_6__2_in_rule__Activity__UnorderedGroup_6__111049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__UnorderedGroup_6__Impl_in_rule__Activity__UnorderedGroup_6__211074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__Program__DescriptionAssignment_0_011108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Program__NameAssignment_0_1_111139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Program__LongNameAssignment_0_1_3_111170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlanImport_in_rule__Program__PlansAssignment_0_1_4_011201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Program__ReferencedProjectsAssignment_0_1_5_111236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_rule__Program__ProjectsAssignment_0_1_611271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_rule__Program__ProjectsAssignment_111302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__Project__DescriptionAssignment_011333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Project__NameAssignment_211364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Project__LongNameAssignment_4_111395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResources_in_rule__Project__ResourcesAssignment_511426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlanImport_in_rule__Project__PlansAssignment_6_011457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssumption_in_rule__Project__AssumptionsAssignment_7_211488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__Project__ConstraintsAssignment_8_211519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityElement_in_rule__Project__ActivitiesAssignment_911550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Assumption__ValueAssignment_111581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Constraint__ValueAssignment_111612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__ActivityGroup__DescriptionAssignment_011643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActivityGroup__NameAssignment_211674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ActivityGroup__LongNameAssignment_4_111705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ActivityGroup__DependenciesAssignment_5_111740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityElement_in_rule__ActivityGroup__ActivitiesAssignment_611775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PlanImport__ImportURIAssignment_111808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_rule__Resources__ResourceAssignment_211839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Resource__NameAssignment_111870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__CheckPoint__DescriptionAssignment_011901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CheckPoint__NameAssignment_211932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CheckPoint__LongNameAssignment_4_111963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CheckPoint__EndAssignment_5_0_0_111994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__CheckPoint__AfterAssignment_5_0_1_112029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CheckPoint__OffsetAssignment_5_0_1_312064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CheckPoint__CompletenessAssignment_5_1_112095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__CheckPoint__DependenciesAssignment_5_1_4_112130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ResourceInvolvement__ResourceAssignment_012169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ResourceInvolvement__OccupationAssignment_1_112204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResponsibility_in_rule__ResourceInvolvement__ResponsibilityAssignment_2_112235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__Activity__DescriptionAssignment_012266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_212297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Activity__LongNameAssignment_4_112328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceInvolvement_in_rule__Activity__InvolvedResourcesAssignment_5_212359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Activity__StartAssignment_6_0_0_112390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Activity__AfterAssignment_6_0_1_112425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Activity__OffsetAssignment_6_0_1_312460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Activity__EndAssignment_6_1_0_0_112491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Activity__DurationAssignment_6_1_0_1_112522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Activity__CompletenessAssignment_6_1_212553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Activity__DependenciesAssignment_6_2_112588 = new BitSet(new long[]{0x0000000000000002L});

}
