<script setup lang="ts"></script>
<template>
  <footer>
    <div class="wrapper">
      <div class="ref-links">
        <div class="footer-section">
          <h1 class="section-title">About Tripadvisor</h1>
          <RouterLink to="/">About Us</RouterLink>
          <RouterLink to="/">Press</RouterLink>
          <RouterLink to="/">Reources and Policies</RouterLink>
          <RouterLink to="/">Careers</RouterLink>
          <RouterLink to="/">Investor Relation</RouterLink>
          <RouterLink to="/">Trust & Safety</RouterLink>
          <RouterLink to="/">Contact Us</RouterLink>
          <RouterLink to="/">Accessibility Statement</RouterLink>
        </div>
        <div class="footer-section">
          <h1 class="section-title">Explore</h1>
          <RouterLink to="/">Write a review</RouterLink>
          <RouterLink to="/">Add a place</RouterLink>
          <RouterLink to="/">Join</RouterLink>
          <RouterLink to="/">Travellers' Choice</RouterLink>
          <RouterLink to="/">Insurance</RouterLink>
          <RouterLink to="/">Green Leader</RouterLink>
          <RouterLink to="/">Blog</RouterLink>
          <RouterLink to="/">Help Center</RouterLink>
          <RouterLink to="/">Tripadvisor Plus</RouterLink>
          <RouterLink to="/">Travel Articles</RouterLink>
        </div>
        <div class="footer-section">
          <h1 class="section-title">Do Business With Us</h1>
          <RouterLink to="/">Owners</RouterLink>
          <RouterLink to="/">Business Advantage</RouterLink>
          <RouterLink to="/">Sponsored Placements</RouterLink>
          <RouterLink to="/">Advertise with Us</RouterLink>
          <RouterLink to="/">Access our Content API</RouterLink>
          <RouterLink to="/">Become an Affilliate</RouterLink>
        </div>
        <div class="footer-section">
          <h1 class="section-title">Get The App</h1>
          <RouterLink to="/">iPhone App</RouterLink>
          <RouterLink to="/">Android App</RouterLink>
        </div>
      </div>
      <div class="copyright-area">
        <div class="icon">
          <img src="/icon.webp" alt="logo" />
        </div>
        <div class="content">
          <div class="copyright">
            © 2022 Tripadvisor LLC All rights reserved.
          </div>
          <div class="others">
            <RouterLink to="/">Terms of Use</RouterLink>
            <RouterLink to="/">Privacy and Cookies Statement</RouterLink>
            <RouterLink to="/">Cookie consent</RouterLink>
            <RouterLink to="/">Site Map</RouterLink>
            <RouterLink to="/">How the site works</RouterLink>
            <RouterLink to="/">Contact us</RouterLink>
          </div>
        </div>
      </div>
    </div>
  </footer>
</template>
<style scoped>
.copyright-area {
  margin-top: 4rem;
  display: flex;
  gap: 1rem;
}
.icon {
  flex: 6rem 0 0;
  aspect-ratio: 1;
}
.icon img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}
.content {
  max-width: 50%;
}
.copyright {
  font-size: 1.4rem;
  color: var(--gray-50);
}
.others {
  margin-top: 1rem;
  display: flex;
  flex-wrap: wrap;
  gap: 1rem;
  row-gap: 0;
  text-decoration: underline;
  font-size: 1.6rem;
}
footer {
  margin-top: 3rem;
  padding: 3rem 2rem;
  background-color: var(--footerBackground);
}
.wrapper {
  max-width: var(--maxPageWidth);
  margin-left: auto;
  margin-right: auto;
}
.ref-links {
  display: flex;
  gap: 5rem;
}
.footer-section {
  display: flex;
  flex-direction: column;
  gap: 1rem;
  font-size: 1.5rem;
}
.section-title {
  font-size: 1.8rem;
}
</style>
