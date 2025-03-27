<script setup type="module">
const data = {
  name: 'this0',
  url: 'http://www.this0.com',
}
</script>

<template>
  <div>
    <a v-bind:href="data.url">
      <input type="button" :value="`点击访问${data.name}`">
    </a>
  </div>
</template>

<style scoped></style>
