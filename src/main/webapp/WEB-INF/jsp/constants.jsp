<script>
appcontext= '${context.webapp.name}';
context="${pageContext.request.contextPath}";
CONTEXT_ROOT = '<%= request.getContextPath() %>';
usuario = "${pageContext.request.userPrincipal.name}";
productor = "${pageContext.request.session.currentProductor.nombre}";
</script>