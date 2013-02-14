package org.jetbrains.jet.plugin.codeInsight.surroundWith;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.jet.lang.psi.JetBlockExpression;
import org.jetbrains.jet.lang.psi.JetExpression;
import org.jetbrains.jet.lang.psi.JetFile;
import org.jetbrains.jet.lang.resolve.BindingContext;
import org.jetbrains.jet.lang.resolve.lazy.ResolveSession;
import org.jetbrains.jet.lang.resolve.lazy.ResolveSessionUtils;
import org.jetbrains.jet.lang.types.JetType;
import org.jetbrains.jet.plugin.project.WholeProjectAnalyzerFacade;

public class KotlinSurrounderUtils {

    public static void addStatementsInBlock(
            @NotNull JetBlockExpression block,
            @NotNull PsiElement[] statements
    ) {
        PsiElement lBrace = block.getFirstChild();
        block.addRangeAfter(statements[0], statements[statements.length - 1], lBrace);
    }

    @Nullable
    public static JetType getExpressionType(JetExpression expression) {
        ResolveSession resolveSession = WholeProjectAnalyzerFacade.getLazyResolveSessionForFile((JetFile) expression.getContainingFile());
        BindingContext expressionBindingContext = ResolveSessionUtils.resolveToExpression(resolveSession, expression);
        return expressionBindingContext.get(BindingContext.EXPRESSION_TYPE, expression);
    }
}
